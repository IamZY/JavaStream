package com.ntuzy.io;

import java.io.File;

/**
 * @Author IamZY
 * @create 2019/12/31 10:29
 */
public class FileDemo {
    
    
    public static void main(String[] args){

        String path = "D:/src/JavaStream/JavaStream/Java.jpg";

        // 构建File对象
        File file = new File(path);
        System.out.println(file.length());  // k

        // 构建File对象
        file = new File("D:/src/JavaStream/JavaStream","Java.jpg");
        System.out.println(file.length());  // k


        //
        file = new File(new File("D:/src/JavaStream/JavaStream"),"Java.jpg");
        System.out.println(file);
    }

}
