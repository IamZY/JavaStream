package com.ntuzy.io;


import java.io.*;
import java.util.Map;

/**
 * 使用文件字节输入 输出流达到文件的拷贝
 *
 * @Author IamZY
 * @create 2020/1/5 11:27
 */
public class Copy {

    public static void main(String[] args) {

        File src = new File("Java.jpg");
        File dest = new File("copy.jpg");

        FileInputStream fis = null;
        FileOutputStream fos = null;


        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dest);

            byte[] flush = new byte[1024];
            int len = -1;

            while ((len = fis.read(flush)) != -1) {
                fos.write(flush, 0, len);
            }
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

            if (null != fis) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }

}
