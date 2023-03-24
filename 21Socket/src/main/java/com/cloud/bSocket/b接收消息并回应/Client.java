package com.cloud.bSocket.b接收消息并回应;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;


/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 14:32
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, server".getBytes());


        // 设置结束标记【这样output内容将会被发送，如果没有这个就会导致阻塞】
        socket.shutdownOutput();


        InputStream inputStream = socket.getInputStream();
        int length;
        byte[] temp = new byte[1024];
        while ((length = inputStream.read(temp)) != -1) {
            System.out.print(new String(temp, 0, length));
        }



        outputStream.close();
        inputStream.close();
        socket.close();

    }
}
