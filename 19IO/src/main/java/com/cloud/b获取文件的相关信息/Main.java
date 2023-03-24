package com.cloud.b获取文件的相关信息;

import java.io.File;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 3:44
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("d:\\test.txt");

        System.out.println("文件名字=" + file.getName());
        System.out.println("文件绝对路径=" + file.getAbsolutePath());
        System.out.println("文件父级目录=" + file.getParent());
        System.out.println("文件大小(字节)=" + file.length());
        System.out.println("文件是否存在=" + file.exists());//T
        System.out.println("是不是一个文件=" + file.isFile());//T
        System.out.println("是不是一个目录=" + file.isDirectory());//F
    }
}
