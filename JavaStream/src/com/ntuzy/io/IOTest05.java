package com.ntuzy.io;

import java.io.*;

/**
 * 字符输出流
 * 创建源
 * 选择流
 * 操作
 * 释放资源
 *
 * @Author IamZY
 * @create 2020/1/3 15:31
 */
public class IOTest05 {
    public static void main(String[] args) {

        File src = new File("dest.txt");
        Writer writer = null;

        try {
            writer = new FileWriter(src, true);
            String str = "111";
            writer.write(str.toCharArray());
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != writer) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
