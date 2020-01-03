package com.ntuzy.io;

import java.io.File;

/**
 * 文件状态
 *  exsit
 * @Author IamZY
 * @create 2019/12/31 10:52
 */
public class FileDemo4 {
    public static void main(String[] args){
        File src = new File("JavaStream/Java.jpg");
        System.out.println(src.getAbsolutePath());
        System.out.println(src.exists());
        System.out.println(src.isFile());
        System.out.println(src.isDirectory());
    }
}
