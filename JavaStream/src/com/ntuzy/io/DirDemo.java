package com.ntuzy.io;

import java.io.File;

/**
 * mkdir() 确保上级目录存在 不存在创建失败
 * mkdirs() 上级目录可以不存在 不存在的话一同创建
 *
 * @Author IamZY
 * @create 2019/12/31 14:50
 */
public class DirDemo {
    public static void main(String[] args){
        File dir = new File("D:/src/JavaStream/JavaStream");
        // 创建目录
        boolean flag = dir.mkdirs();
        System.out.println(flag);
        // 创建目录
        dir = new File("D:/src/JavaStream/JavaStream/dir");
        flag = dir.mkdir();
        System.out.println(flag);
    }
}
