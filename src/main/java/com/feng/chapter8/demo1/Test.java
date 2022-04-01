package com.feng.chapter8.demo1;

import java.util.function.Supplier;

/**
 * @Author jinx
 * @Date 2022/3/30
 * @Desc
 */
public class Test {
    public static void main(String[] args) {
        // 像引用方法一样引用构造函数
        Supplier<Product> supplier = Product::new;
        System.out.println(supplier.get());
    }
}
