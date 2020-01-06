package com.ntuzy.io;

import java.io.*;

/**
 * @Author IamZY
 * @create 2020/1/6 16:16
 */
public class PrintTest01 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = System.out;

        ps.println("打印流");
        ps.println(true);

        ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")), true);
        ps.println("打印流");
        ps.println(true);
        ps.close();
        // 重定向到文件中
        System.setOut(ps);
        System.out.println("change");

        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)), true));
        System.out.println("back");

    }
}
