package com.feng.chapter5.demo11;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author jinx
 * @date 2018/4/24 10:58
 * Desc:创建无限流
 */
public class Test4 {
    public static void main(String[] args) {
        //1.iterate静态方法
        //偶数
        Stream.iterate(0,n->n+2).limit(10).forEach(System.out::println);
        //斐波拉契元组序列
        Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]}).limit(20).forEach(t->System.out.println(t[0]+"-"+t[1]));
        //斐波那契数列
        Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]}).limit(20).map(t->t[0]).forEach(System.out::println);

        //2.generate静态方法
        Stream.generate(Math::random).limit(10).forEach(System.out::println);

        IntSupplier intSupplier = new IntSupplier() {
            private int previous=0;
            private int current=1;
            @Override
            public int getAsInt() {
                int oldPrevious = this.previous;
                int nextValue = this.current+this.previous;
                this.previous = this.current;
                this.current = nextValue;
                return oldPrevious;
            }
        };
        IntStream.generate(intSupplier).limit(10).forEach(System.out::println);
    }
}
