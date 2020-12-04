package com.myz.common.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author yzMa
 * @desc
 * @date 2020/12/4 11:10
 * @email 2641007740@qq.com
 */
public class DateMonthUtil {

    private DateMonthUtil(){}

    public static String nowMothStr(){
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        String format = sdf.format(time);
        return format;
    }

    public static void main(String[] args) {
        System.out.println(nowMothStr());
    }
}
