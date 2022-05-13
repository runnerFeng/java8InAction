/**
 * @Author jinx
 * @Date 2022/3/29
 * @Desc 第三部分高效java8编程，第八章：重构，测试和调试
 * 1.从匿名类到lambda表达式的转化，但是要注意一些情况下会使之复杂（1.supper/this在两种情况下含义不同；2.设计重载时需注意会使代码更加晦涩）
 * 2.从lambda到方法引用的转化
 * 3.从命令式的数据处理切换到Stream。（建议将迭代器处理集合的代码转换到Stream API的方式）
 * 4.peek方法在分析Stream流水线时，能将中间变量的值输出到日志中
 */
package com.feng.chapter8;