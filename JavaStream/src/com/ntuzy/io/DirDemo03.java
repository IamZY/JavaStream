package com.ntuzy.io;

import java.io.File;

/**
 * @Author IamZY
 * @create 2019/12/31 15:16
 */
public class DirDemo03 {
    public static void main(String[] args) {
        File src = new File("D:/src/JavaStream/JavaStream");
        printName(src, 0);
    }

    private static void printName(File src, int deep) {

        for (int i = 0; i < deep; i++) {
            System.out.print("-");
        }
        System.out.println(src.getName());

        if (src == null || !src.exists()) {
            return;
        } else if (src.isDirectory()) {   // 是目录
            for (File f : src.listFiles()) {
                int temp = deep;
                int x = ++temp;
//                System.out.println(x);
//                int y = temp + 1;
//                System.out.println(y);
                printName(f, x);  // printName(f,++deep)
            }
        }
    }
}
