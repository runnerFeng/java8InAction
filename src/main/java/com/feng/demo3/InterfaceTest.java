package com.feng.demo3;

/**
 * Desc:default static修饰方法
 * Created by jinx on 2017/9/28.
 */
public interface InterfaceTest {
    static String test2() {
        return null;
    }

    void test();

    default String test1() {
        return null;
    }

}
