package com.ntuzy.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author IamZY
 * @create 2020/1/6 15:21
 */
public class BufferedTest04 {
    public static void main(String[] args){
        File dest = new File("dest.txt");

        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(dest,true));
            writer.write("aaa");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != writer) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
