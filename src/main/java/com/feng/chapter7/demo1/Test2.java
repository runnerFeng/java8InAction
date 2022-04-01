package com.feng.chapter7.demo1;

import java.util.stream.LongStream;

/**
 * @Author jinx
 * @Date 2022/3/24
 * @Desc 并行流正确使用案例
 */
public class Test2 {
    public static void main(String[] args) {
        // 串行执行加法
        long start = System.currentTimeMillis();
        sequentialSum();
        long end = System.currentTimeMillis();
        long costTime = end - start;
        System.out.println("sequentialSum cost time:" + costTime);
        // 并行流执行加法
        parallelSum();
        System.out.println("parallelSum cost time:" + (System.currentTimeMillis() - end));

        // 以上两种测试方式与预期不符的原因在于
        // 1.LongStream直接生成原始类型long，没有装箱拆箱操作
        // 2.rangClosed生成的范围容易拆分小块
        // 所以此时并行流比串行有了很大的性能提升
    }

    private static Long parallelSum() {
        return LongStream.rangeClosed(1,100_0000_000).parallel().reduce(0, Long::sum);
    }

    private static Long sequentialSum() {
        return LongStream.rangeClosed(1,100_0000_000).reduce(0, Long::sum);
    }
}
