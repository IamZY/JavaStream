package com.ntuzy.io;

import java.io.File;

/**
 * list() 找出下级名称
 * listFiles 列出下级File对象
 *
 * @Author IamZY
 * @create 2019/12/31 15:08
 */
public class DirDemo02 {
    public static void main(String[] args) {
        File dir = new File("D:/src/JavaStream/JavaStream");

        String[] subNames = dir.list();
        for(String str : subNames) {
            System.out.println(str);
        }

        File[] subFiles = dir.listFiles();
        for(File file : subFiles) {
            System.out.println(file.getAbsolutePath());
        }

    }
}
