package com.ntuzy.io;

import java.io.File;

/**
 * @Author IamZY
 * @create 2019/12/31 10:25
 */
public class PathDemo {
    public static void main(String[] args){
        String path = "D:\\src\\JavaStream\\JavaStream\\Java.jpg";
        System.out.println(File.separatorChar);

        // 建议
        path = "D:/src/JavaStream/JavaStream/Java.jpg";
        // 常量拼接
        path = "D:" + File.separatorChar + "src";
        System.out.println(path);




    }
}
