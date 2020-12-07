package com.myz.common.util;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * @author yzMa
 * @desc
 * @date 2020/11/5 19:09
 * @email 2641007740@qq.com
 */
public class DateUtil {

    private DateUtil(){}

    /**
     * CN("Asia/Shanghai"),
     * US("America/New_York"),
     * IN("Asia/Kolkata"),
     * @param amountDays
     * @return
     * @throws ParseException
     */
    public static String truncateDayAndAddDayStr(int amountDays) throws ParseException {
//        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(""));
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        calendar.add(Calendar.DAY_OF_MONTH,amountDays);
        return formatDateWithTimeZone(calendar);
    }

    /**
     *
     * @return
     */
    public static String nowDateStr(){
        Calendar calendar = Calendar.getInstance();
        return formatDateWithTimeZone(calendar);
    }

    /**
     *
     * @return
     * @throws ParseException
     */
    public static Date truncateDay() throws ParseException {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }


    /**
     *
     * @return
     * @throws ParseException
     */
    public static String truncateDayStr() throws ParseException {
        return truncateDayAndAddDayStr(0);
    }


    /**
     *
     * @param calendar
     * @return
     */
    private static String formatDateWithTimeZone(Calendar calendar){
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);
        return String.format("%s-%s-%s %s:%s:%s", year, month<10?"0"+month:month, day<10?"0"+day:day,hour<10?"0"+hour:hour,minute<10?"0"+minute:minute,seconds<10?"0"+seconds:seconds);
    }
}
