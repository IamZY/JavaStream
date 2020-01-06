package com.ntuzy.io;

import java.io.*;

/**
 * @Author IamZY
 * @create 2020/1/6 15:18
 */
public class BufferedTest03 {
    public static void main(String[] args){

        File src = new File("abc.txt");

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(src));

            String line = null;
            while ((line = reader.readLine()) != null) {
//                String str = reader.readLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != reader) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
