package com.ntuzy.io;

import java.io.*;
import java.util.TreeMap;

/**
 * @Author IamZY
 * @create 2020/1/6 15:12
 */
public class BufferedTest02 {
    public static void main(String[] args) {


        File dest = new File("dest.txt");

        OutputStream os = null;

        try {
            os = new BufferedOutputStream(new FileOutputStream(dest, true));

            os.write("hello world".getBytes());

            os.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null!=os) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
