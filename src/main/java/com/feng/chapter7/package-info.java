/**
 * @Author jinx
 * @Date 2022/3/24
 * @Desc 第二部分函数式数据处理，第七章：并行数据处理与性能
 * 1.将顺序流转化为并行流：Stream.sequential;Stream.parallel两个方法将流转化为串行流和并行流（并行流要注意使用场景）
 * 2.正确使用并行流：要避免共享可变状态，确保并行流得到正确的结果
 * 3.Spliterator：可分迭代器，用于并行执行而设计
 */
package com.feng.chapter7;