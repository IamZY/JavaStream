package com.ntuzy.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @Author IamZY
 * @create 2020/1/6 16:27
 */
public class RandTest01 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(new File("abc.txt"), "r");

        // 读取文件部分内容
        int beginPos = 2;
        int actualSize = 3;

        // 随机读取
//        raf.seek(2);

        byte[] flush = new byte[1024];
        int len = -1;
        while ((len = raf.read(flush)) != -1) {

            if (actualSize > len) {
                System.out.println(new String(flush, 0, len));
                actualSize -= len;
            } else {
                System.out.println(new String(flush, 0, actualSize));
            }

        }

        raf.close();

    }


    public static void test1() throws IOException {
        RandomAccessFile raf = new RandomAccessFile(new File("abc.txt"), "r");

        // 随机读取
//        raf.seek(2);

        byte[] flush = new byte[1024];
        int len = -1;
        while ((len = raf.read(flush)) != -1) {
            System.out.println(new String(flush, 0, len));
        }

        raf.close();
    }


}
