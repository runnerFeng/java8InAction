/**
 * @Author jinx
 * @Date 2022/4/1
 * @Desc 第四部分高效java8编程，第十章：用Optional取代null
 * 1.使用静态工厂方法创建optional:Optional.empty;Optional.of;Optional.ofNullable
 * 2.map:提取转换值，如果值存在， 就对该值执行提供的mapping函数调用
 * 3.flatMap:链接值，如果值存在，就对该值执行提供的mapping函数调用，返回一个optional类型的值，否则就返回一个空的optional对象
 * 4.filter:使用filter提出特定值
 */
package com.feng.chapter10;