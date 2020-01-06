package com.ntuzy.io;

import java.io.*;
import java.nio.Buffer;

/**
 * 转换流
 *
 * @Author IamZY
 * @create 2020/1/6 15:26
 */
public class ConvertTest {
    public static void main(String[] args) {
        // 操作System.in System.out

        try (BufferedReader isr = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter osw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String msg = "";

            while (!msg.equals("exit")) {
                String str = isr.readLine();
                osw.write(str);
                osw.newLine();
                osw.flush();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
