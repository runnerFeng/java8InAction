package com.feng.chapter5.demo11;

import java.util.Arrays;

/**
 * @author jinx
 * @date 2018/4/24 10:33
 * Desc:由数组创建流
 */
public class Test2 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);
    }
}
