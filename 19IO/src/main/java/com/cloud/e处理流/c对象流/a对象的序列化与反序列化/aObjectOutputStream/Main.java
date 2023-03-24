package com.cloud.e处理流.c对象流.a对象的序列化与反序列化.aObjectOutputStream;

import com.cloud.e处理流.c对象流.a对象的序列化与反序列化.Dog;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 7:51
 */
public class Main {
    public static void main(String[] args) throws IOException {

        String filePath = "e:\\objectData.dat";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        objectOutputStream.writeInt(100);
        objectOutputStream.writeBoolean(true);
        objectOutputStream.writeUTF("我爱我的祖国");
        objectOutputStream.writeChar('A');
        objectOutputStream.writeDouble(10.5);

        objectOutputStream.writeObject(new Dog(19, "小狗"));

        objectOutputStream.close();

        new Dog(19, "小狗");

    }
}



