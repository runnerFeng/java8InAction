package com.feng.chapter5.demo11;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author jinx
 * @date 2018/4/24 10:39
 * Desc:由文件生成流
 */
public class Test3 {
    public static void main(String[] args) {
        long uniqueWords = 0;
        try {
            Stream<String> lines = Files.lines(Paths.get("f:\\data.txt"), Charset.defaultCharset());
//            lines.map(line-> Arrays.stream(line.split(" "))).forEach(System.out::println);
//            lines.flatMap(line-> Arrays.stream(line.split(" "))).forEach(System.out::println);
            uniqueWords = lines.flatMap(line-> Arrays.stream(line.split(" "))).distinct().count();
            System.out.println(uniqueWords);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
