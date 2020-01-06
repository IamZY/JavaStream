package com.ntuzy.io;

import java.io.*;

/**
 * @Author IamZY
 * @create 2020/1/6 16:16
 */
public class PrintTest02 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream("print.txt")), true);
        pw.println("打印流1");
        pw.println(true);
        pw.close();

    }
}
