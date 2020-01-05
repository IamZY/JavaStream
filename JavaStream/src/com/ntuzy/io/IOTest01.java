package com.ntuzy.io;

import javax.swing.plaf.synth.SynthSpinnerUI;
import java.io.*;

/**
 * 理解操作步骤
 * 创建元
 * 选择流
 *
 * @Author IamZY
 * @create 2020/1/3 15:31
 */
public class IOTest01 {
    public static void main(String[] args) {

        File src = new File("abc.txt");

        InputStream is = null;

        try {
            is = new FileInputStream(src);

//            int data1 = is.read();
//            int data2 = is.read();
//            int data3 = is.read();
//            int data4 = is.read();
//
//            System.out.println((char) data1);
//            System.out.println((char) data2);
//            System.out.println((char) data3);
//            System.out.println(data4);

            int temp;
            while ((temp = is.read()) != -1) {
                System.out.print((char) temp);
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
