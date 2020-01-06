package com.ntuzy.io;

import java.io.*;

/**
 * @Author IamZY
 * @create 2020/1/6 15:49
 */
public class DataTest {
    public static void main(String[] args) throws IOException {

        // 写出
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);

        dos.writeUTF("你好");
        dos.writeInt(18);
        dos.writeBoolean(true);
        dos.flush();
        byte[] datas = baos.toByteArray();

        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(datas));
        String str = dis.readUTF();
        int i = dis.readInt();

        System.out.println(i);
        System.out.println(str);

    }
}
