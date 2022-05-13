package com.feng.chapter12.demo1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

/**
 * @Author jinx
 * @Date 2022/5/8
 * @Desc
 */
public class Test1 {

    public static void main(String[] args) {
        // 日期
        // 1.of静态工厂方法创建对象
        LocalDate localDate = LocalDate.of(2022,5,8);
        System.out.println("1:"+localDate);
        System.out.println("2:"+localDate.getYear());
        System.out.println("3:"+localDate.getMonth());
        System.out.println("4:"+localDate.getDayOfMonth());
        System.out.println("5:"+localDate.getDayOfWeek());

        LocalDate now = LocalDate.now();
        System.out.println("6:"+now);

        System.out.println("7:"+localDate.get(ChronoField.YEAR));
        // 2.parse静态工厂方法解析字符串创建对象
        LocalDate parse = LocalDate.parse("2022-05-03");
        System.out.println("8:"+parse);
        // 2.1.定义格式
        parse = LocalDate.parse("2022-02-03", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("9:"+parse);
        parse = LocalDate.parse("2022-02-03", DateTimeFormatter.ISO_DATE);
        System.out.println("10:"+parse);

        System.out.println("-----------------");
        // 时间
        LocalTime localTime = LocalTime.of(12,33,54);
        System.out.println("1:"+localTime);
        System.out.println("2:"+localTime.getHour());
        System.out.println("3:"+localTime.getMinute());
        System.out.println("4:"+localTime.getSecond());
        LocalTime localTime1 = LocalTime.of(12,33,54, 999_999_99);
        System.out.println("5:"+localTime1);

        LocalTime localTime2 = LocalTime.parse("12:32:56");
        System.out.println("6:"+localTime2);

        System.out.println("+++++++++++++++");
        // 日期+时间
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("1:"+localDateTime);

        // 通过of()静态方法合并日期和时间
        localDateTime = LocalDateTime.of(localDate,localTime);
        System.out.println("2:"+localDateTime);
        // 提取日期或者时间
        LocalDate localDate1 = localDateTime.toLocalDate();
        System.out.println("3:"+localDate1);
        LocalTime localTime3 = localDateTime.toLocalTime();
        System.out.println("4:"+localTime3);

        System.out.println("*****************");
        // 获取当前时间的时间戳,Instant的设计初衷是为了机器使用，它包含秒和纳秒所构成的数字
        Instant now1 = Instant.now();
        System.out.println("1:"+now1.getEpochSecond());
        // period between方法
        Period period = Period.between(LocalDate.of(2022,4,3),LocalDate.of(2022,4,5));
        System.out.println("2:"+period.getDays());

        // withAttribute方法重置属性值,创建副本，不修改原来的对象
        LocalDate localDate2 = LocalDate.of(2022,2,3);
        LocalDate localDate3 = localDate2.withYear(2021);
        System.out.println("3:"+localDate2.getYear());
        System.out.println("4:"+localDate3.getYear());

        LocalDate localDate4 = localDate3.withDayOfMonth(2);
        System.out.println("5:"+localDate4);
        // 通过with方法使用ChronoField枚举 定义通用的方法
        LocalDate localDate5 = localDate4.with(ChronoField.YEAR,2023);
        System.out.println("6:"+localDate5);

        // 使用TemporalAdjusters的静态工厂方法
        LocalDate localDate6 = LocalDate.of(2022,5,13);
        LocalDate localDate7 = localDate6.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("7:"+localDate7);
        LocalDate localDate8 = localDate6.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("8:"+localDate8);

        // 时区的设置
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("9:"+zoneId);
        System.out.println("10:"+zoneId.getId());
        // 时区偏移




    }
}
