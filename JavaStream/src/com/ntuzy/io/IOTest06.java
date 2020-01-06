package com.ntuzy.io;

import java.io.*;

/**
 * 字节数组输入流
 * 创建源
 * 选择流
 * 操作
 * 释放资源
 *
 * @Author IamZY
 * @create 2020/1/3 15:31
 */
public class IOTest06 {
    public static void main(String[] args) throws IOException {

        byte[] src = "talk is cheap show me the code".getBytes();

        InputStream is = null;

        is = new ByteArrayInputStream(src);

        byte[] flush = new byte[1024];
        int len = -1;

        while ((len = is.read(flush)) != -1) {
            String str = new String(flush, 0, len);
            System.out.print(str);
        }

        is.close();

    }
}
