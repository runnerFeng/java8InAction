/**
 * @Author jinx
 * @Date 2022/3/17
 * @Desc 第二部分函数式数据处理，第五章：使用流
 * 1.筛选和切片：distinct,limit,skip(跳过前n个元素，返回剩下的元素)
 * 2.映射：map():映射一个新的流,flatmap()：将各个流扁平化为一个流
 * 3.Arrays.stream():接收一个数组并产生一个流
 * 4.查找和匹配（短路操作）：allMatch,anyMatch,noneMatch,findAny,findFirst
 * 5.归约，reduce():1.接受两个参数和一个参数的方法，还有三个参数的方法；一个入参时没有初始值，故返回一个optional容器；两个入参时有初始值，
 * 故返回一个具体结果；map，reduce的连接通常称为map-reduce模式，因google通常使用他来搜索而出名，因为他很容易并行化；
 * 6.stream().xxx.collect(toList());stream().xxx.collect(toSet())也可以返回set集合进行去重;
 * 7.reduce(BinaryOperator<T> t):可以根据入参lambda进行计算归约
 * 8.stream().xxx.collect(joining()),joining()方法可以连接字符串，内部使用StringBuilder()实现。
 * 9.min()/max()函数接受一个Comparator参数指定计算最小或最大值时要比较哪个键值
 * 10.数值流：IntStream,DoubleStream,LongStream分别将流中的元素特化为int,double,long来避免装箱成本，每个接口都带来了常用数值归约的
 * 新方法（sum,max,min,average...），可以通过MapToInt...等进行常规流到特化流的转化，可以通过boxed()方法进行特化流到常规流的转化
 * 11.三种特化流分别对应三种特化Optional容器，OptionalInt,OptionalLong,OptionalDouble来接可能为空的操作（求最大值时，如果容器为空则返回空，
 * 而不是0）
 * 12.数值范围：java8引入了两个可以用于IntStream,LongStream的静态方法生成数值范围：range(),rangeClosed()
 * 13.创建流：Stream.of(T... values);Arrays.stream(int[] array);Stream.iterate(T seed,UnaryOperator<T> f)生成无限流;
 * Stream.generate(Supplier<T> s)生成无限流;
 * 14.在并行流中使用有状态的供应源是不安全的（Stream.generate(Supplier<T> s)）
 *
 */
package com.feng.chapter5;