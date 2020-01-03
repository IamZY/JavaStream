package com.ntuzy.io;

import java.io.File;

/**
 * 绝对路径和相对路径
 * 存在盘符 绝对路径
 * 不存在盘符 相对路径
 *
 * @Author IamZY
 * @create 2019/12/31 10:34
 */
public class FileDemo2 {
    public static void main(String[] args) {

        String path = "D:/src/JavaStream/JavaStream/Java.jpg";

        // 绝对路径
        File file = new File(path);
        System.out.println(file.getAbsolutePath());

        System.out.println(System.getProperty("user.dir"));
        file = new File("Java.jpg");
        System.out.println(file.getAbsolutePath());

    }

}
