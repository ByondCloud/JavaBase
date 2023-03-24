package com.cloud.bSocket.d发送图片;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/23
 * @Time 12:45
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();

        String savePath = "f:\\socket.png";
        int length;
        byte[] temp = new byte[1024];
        FileOutputStream fileOutputStream = new FileOutputStream(savePath);

        while ((length = inputStream.read(temp)) != -1) {
            fileOutputStream.write(temp, 0, length);
        }

        System.out.println("传输完成");

        fileOutputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();



    }
}
