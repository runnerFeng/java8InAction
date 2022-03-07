package com.feng.chapter1.demo4;

import java.util.stream.Stream;

/**
 * @author jinx
 * @date 2018/4/9 14:28
 * Desc:
 */
public class Test {
    public static void main(String[] args) {
//        Integer i = () -> {};
        Integer integer = Stream.of(1, 3, 5, 6).reduce(0, (a, b) -> a + b);
        System.out.println(integer);
        String string = Stream.of("a", "b", "d").reduce("s", (a, b) -> a + b);
        System.out.println(string);
    }
}
