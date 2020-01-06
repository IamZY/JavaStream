package com.ntuzy.io;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

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
public class IOTest07 {
    public static void main(String[] args) throws IOException {

        byte[] dest = null;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        String str = "show me the code";

        baos.write(str.getBytes());

        baos.flush();

        dest = baos.toByteArray();

        System.out.println(new String(dest));

    }
}
