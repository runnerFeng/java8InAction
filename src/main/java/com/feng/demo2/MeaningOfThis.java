package com.feng.demo2;

/**
 * Desc:
 * Created by jinx on 2017/9/27.
 */
public class MeaningOfThis {
    public final int value = 4;
    // Runnable表示一块要执行的代码块
    Thread t = new Thread(new Runnable() {
        public void run() {
            System.out.println("Hello world");
        }
    });
    // lambda实现
    Thread t1 = new Thread(() -> System.out.println("Hello world"));

    public static void main(String[] args) {
        MeaningOfThis meaningOfThis = new MeaningOfThis();
        meaningOfThis.doIt();
    }

    // this
    public void doIt() {
        int value = 6;
        Runnable runnable = new Runnable() {
            public final int value = 5;

            @Override
            public void run() {
                int value = 10;
                System.out.println(this.value);
            }
        };
        runnable.run();
    }
}
