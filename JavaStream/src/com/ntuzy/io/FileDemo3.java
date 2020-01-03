package com.ntuzy.io;

import java.io.File;

/**
 * 名称或路径
 *
 * @Author IamZY
 * @create 2019/12/31 10:48
 */
public class FileDemo3 {
    public static void main(String[] args){
        File file = new File("D:\\src\\JavaStream\\JavaStream\\Java.jpg");

        System.out.println(file.getName());
        System.out.println(file.getPath());  // 相对路径
        System.out.println(file.getAbsolutePath());  // 绝对路径
        System.out.println(file.getParent());  // 上一级
        System.out.println(file.getParentFile().getName());  //

    }
}
