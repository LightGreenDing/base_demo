package com.zed.base_demo.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 时间工具类
 *
 * @author:Zed
 * @date: 2019/4/21
 */
public class DateTimeUtil {


    /**
     * 获取当前时间之前或之后几小时 hour
     * @param hour 小时数
     * @return
     */
    public static String getTimeByHour(int hour) {

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) + hour);

        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());

    }

    /**
     * 获取当前时间之前或之后几分钟 minute
     * @param minute 分钟数
     * @return
     */
    public static String getTimeByMinute(int minute) {

        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.MINUTE, minute);

        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());

    }
}
