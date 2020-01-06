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
public class IOTest04 {
    public static void main(String[] args) {

        File src = new File("dest.txt");

        Reader reader = null;

        try {
            reader = new FileReader(src);

            char[] flush = new char[2];
            int len = -1;
            while ((len = reader.read(flush)) != -1) {
                String str = new String(flush, 0, len);
                System.out.print(str);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null!=reader) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
