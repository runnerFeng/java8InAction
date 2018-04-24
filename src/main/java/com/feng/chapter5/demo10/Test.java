package com.feng.chapter5.demo10;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author jinx
 * @date 2018/4/23 11:34
 * Desc:勾股数
 */
public class Test {
    public static void main(String[] args) {
//        IntStream.rangeClosed(1, 100).filter(b -> Math.sqrt(a * a + b * b) % 1 == 0).boxed().map(b -> new int[]{a, b, (int) Math.sqrt(a * a, b * b)});
//        IntStream.rangeClosed(1, 100).filter(b -> Math.sqrt(a * a + b * b) % 1 == 0).mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a, b * b)});
        Stream<int[]> pythagoreanTriples = IntStream.rangeClosed(1, 100).boxed().flatMap(a -> IntStream.rangeClosed(a, 100)
                .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0).mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)}));
        pythagoreanTriples.forEach(t -> System.out.println(t[0] + "," + t[1] + "," + t[2]));

        Stream<double[]> pythagoreanTriples2 = IntStream.rangeClosed(1, 100).boxed().flatMap(a -> IntStream.rangeClosed(a, 100)
                .mapToObj(b -> new double[]{a, b, Math.sqrt(a * a + b * b)}).filter(t -> t[2] % 1 == 0));
    }

}
