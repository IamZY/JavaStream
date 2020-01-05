package com.ntuzy.io;

import sun.misc.OSEnvironment;

import java.io.*;

/**
 * 字节输出流
 * 创建源
 * 选择流
 * 操作
 * 释放资源
 *
 * @Author IamZY
 * @create 2020/1/3 15:31
 */
public class IOTest03 {
    public static void main(String[] args) {

        File src = new File("dest.txt");

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(src, true);
            String str = "io is not hard";
            byte[] datas = str.getBytes();
            fos.write(datas);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fos) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
