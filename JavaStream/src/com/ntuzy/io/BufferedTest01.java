package com.ntuzy.io;


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
public class BufferedTest01 {
    public static void main(String[] args) {

        File src = new File("abc.txt");
        InputStream is = null;
        try {

            is = new BufferedInputStream(new FileInputStream(src));
            byte[] flush = new byte[1024];
            int len = -1;

            while ((len = is.read(flush)) != -1) {
                String str = new String(flush, 0,len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
