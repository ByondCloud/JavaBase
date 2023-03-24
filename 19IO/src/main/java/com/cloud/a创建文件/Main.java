package com.cloud.a创建文件;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 3:16
 */
public class Main {
    public static void main(String[] args) {

    }


    // 方式一 通过路径创建
    @Test
    public void create1() {
        String path = "d:\\new.txt";
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 方式二 通过父子路径创建
    @Test
    public void create2() {
        File file = new File("d:\\zioTest");
        String fileName = "test.txt";

        File file1 = new File(file, fileName);

        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 方式三 通过父子路径创建
    @Test
    public void create3() {

        String parentName = "d:\\zioTest";
        String fileName = "test.txt";

        File file1 = new File(parentName, fileName);

        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
