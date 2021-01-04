package com.myz.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yzMa
 * @desc
 * @date 2021/1/4 11:55
 * @email 2641007740@qq.com
 */
public class PrintUtil {

    private PrintUtil(){}

    public static void print(Object obj){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(new Date());
        System.out.println(Thread.currentThread().getName()+" "+format+" "+obj);
    }
}
