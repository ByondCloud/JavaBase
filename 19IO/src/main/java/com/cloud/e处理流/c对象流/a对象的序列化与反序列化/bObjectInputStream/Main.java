package com.cloud.e处理流.c对象流.a对象的序列化与反序列化.bObjectInputStream;

import com.cloud.e处理流.c对象流.a对象的序列化与反序列化.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 8:06
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "e:\\objectData.dat";

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readBoolean());
        System.out.println(objectInputStream.readUTF());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readDouble());
        Dog dog = (Dog) objectInputStream.readObject();
        System.out.println(dog);

    }
}

