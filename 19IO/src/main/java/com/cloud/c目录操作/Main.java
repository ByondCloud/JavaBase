package com.cloud.c目录操作;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 4:05
 */
public class Main {

    // 判断文件是否存在，如果存在则删除
    // 判断目录是否存在（也是file对象）
    // 在java中，目录也当做对象看待，所以一样可以用file.delete()方法
    @Test
    public void method01() {
        String filePath = "e:\\news1.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }
        } else {
            System.out.println("该文件不存在...");
        }
    }


    // 创建目录
    @Test
    public void method02() {
        String filePath = "e:\\hello";
        File file = new File(filePath);
        file.mkdir();


        // 创建多级目录，需要用mkdirs
        filePath = "d:\\hello\\world";
        File file1 = new File(filePath);
        file1.mkdirs();

    }
}
