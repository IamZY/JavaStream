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

interface IPerson {

}

public class IOTest08 {

    public static void main(String[] args) throws IOException {

        byte[] bytes = fileToByteArray("Java.jpg");
        System.out.println(bytes.length);
        byteArrayToFile(bytes, "copy1.jpg");
    }


    /**
     * 图片转成字节数组
     *
     * @param filePath
     * @return
     */
    public static byte[] fileToByteArray(String filePath) {

        File src = new File(filePath);

        try (InputStream is = new FileInputStream(src); ByteArrayOutputStream baos = new ByteArrayOutputStream();) {

            byte[] flush = new byte[1024];
            int len = -1;

            while ((len = is.read(flush)) != -1) {
                baos.write(flush, 0, len);
            }

            baos.flush();

            return baos.toByteArray();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }


    /**
     * 字节数组读取到图片中
     *
     * @param src
     * @param filePath
     */
    public static void byteArrayToFile(byte[] src, String filePath) {


        File dest = new File(filePath);
        FileOutputStream fos = null;
        InputStream is = null;


        try {
            is = new ByteArrayInputStream(src);
            fos = new FileOutputStream(filePath);


            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                fos.write(flush, 0, len);
            }

            fos.flush();
        } catch (Exception e) {
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
