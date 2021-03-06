package com.ntuzy.io;

import java.io.*;

/**
 * 理解操作步骤
 * 创建元
 * 选择流
 *
 * @Author IamZY
 * @create 2020/1/3 15:31
 */
public class IOTest02 {
    public static void main(String[] args) {

        File src = new File("abc.txt");

        InputStream is = null;

        try {
            is = new FileInputStream(src);

            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                // 字节数组到字符串
                String str = new String(flush, 0, len);
                System.out.print(str);
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
