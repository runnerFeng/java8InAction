package com.feng.demo1;

import java.io.File;
import java.io.FileFilter;

/**
 * Desc:
 * Created by jinx on 2017/9/26.
 */
public class Test1 {
    public static void main(String[] args) {

        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            public boolean accept(File file) {
                return file.isHidden();
            }
        });

        File[] hiddenFiles1 = new File(".").listFiles(File::isHidden);

    }
}
