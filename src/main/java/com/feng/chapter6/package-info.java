/**
 * @Author jinx
 * @Date 2022/3/21
 * @Desc 第二部分函数式数据处理，第六章：用流收集数据
 * 1.预定义收集器：主要功能是归约汇总，分组，分区
 * 2.Collectors.counting();Collectors.maxBy();Collectors.minBy();Collectors.summingInt();Collectors.summingDouble();
 * Collectors.averagingInt(),averagingLong,averagingDouble();
 * 3.汇总，统计最大值，最小值，平均值，sum,count:IntSummarizingStatistics;LongSummarizingStatistics;DoubleSummarizingStatistics;
 * 4.多级分组：Collectors.groupingBy()两个参数的方法实现多级分组
 * 5.按子组收集数据Collectors.collectionAndThen()方法
 * 6.分区：Collectors.partitionBy()特殊化的分组，由一个谓词作为分类函数，返回键是true/false的两组结果;
 */
package com.feng.chapter6;