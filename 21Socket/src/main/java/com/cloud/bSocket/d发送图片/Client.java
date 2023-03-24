package com.cloud.bSocket.d发送图片;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/23
 * @Time 12:27
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        String path = "d:\\test.png";
        FileInputStream fileInputStream = new FileInputStream(path);
        byte[] temp = new byte[1024];
        int length;
        while ((length = fileInputStream.read(temp)) != -1) {
            outputStream.write(temp);
        }


        System.out.println("传输完毕");

        fileInputStream.close();
        outputStream.close();
        socket.close();

    }
}
