package com.feng.chapter5.demo11;

import java.util.stream.Stream;

/**
 * @author jinx
 * @date 2018/4/24 10:16
 * Desc:由值创建流
 */
public class Test {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("java8","in","action");
        stringStream.map(String::toUpperCase).forEach(System.out::println);

        Stream<String> empty = Stream.empty();
    }
}
