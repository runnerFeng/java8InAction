package com.feng.chapter7.demo1;

import java.util.stream.Stream;

/**
 * @Author jinx
 * @Date 2022/3/24
 * @Desc 并行流错误使用案例
 */
public class Test1 {
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
        // 1.iterate生成的对象是装箱对象，每次做加法还得进行拆箱操作
        // 2.iterate不能被拆分块（因为每次应该该函数都要依赖前一次的结果）,所以第二个函数parallel不能并行执行，反而每次求和要分到不同的
        // 线程执行，增加了计算的负担
    }

    private static int parallelSum() {
        return Stream.iterate(1, i -> i + 1).limit(100_0000_00).parallel().reduce(0, Integer::sum);
    }

    private static int sequentialSum() {
        return Stream.iterate(1, i -> i + 1).limit(100_0000_00).reduce(0, Integer::sum);
    }
}
