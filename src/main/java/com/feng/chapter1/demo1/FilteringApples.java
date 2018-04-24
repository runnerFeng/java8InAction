package com.feng.chapter1.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Desc:筛选苹果测试
 * Created by jinx on 2017/9/26.
 */
public class FilteringApples {

    public static void main(String[] args) {
        List<Apple> invetory = Arrays.asList(new Apple("green", 80),
                new Apple("green", 155),
                new Apple("red", 120));

        // 排序 Comparator实现
        invetory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });

        //排序 lambda实现
        invetory.sort((Apple o1, Apple o2) -> o1.getWeight().compareTo(o2.getWeight()));

        // 将调用和具体实现分离
        // 1.传递方法
        // 绿色苹果
        List<Apple> greenApples = filterApples(invetory, FilteringApples::isGreenApple);
        System.out.println(greenApples);

        // 大于150g的苹果
        List<Apple> heavyApples = filterApples(invetory, FilteringApples::isHeavyApple);
        System.out.println(heavyApples);

        // 2.lambda
        // 绿色苹果
        List<Apple> greenApples2 = filterApples(invetory, (Apple a) -> "green".equals(a.getColor()));
        System.out.println(greenApples2);

        // 大于150g的苹果
        List<Apple> heavyApples2 = filterApples(invetory, (Apple a) -> a.getWeight() > 150);
        System.out.println(heavyApples2);

        // 测试
        List<Apple> weirdApples = filterApples(invetory, (Apple a) -> a.getWeight() < 80 || "brown".equals(a.getColor()));
        System.out.println(weirdApples);

    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > 150) {
                result.add(apple);
            }
        }
        return result;
    }

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }

    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static class Apple {
        private String color;
        private Integer weight;

        public Apple(String color, Integer weight) {
            this.color = color;
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "color='" + color + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }
}

