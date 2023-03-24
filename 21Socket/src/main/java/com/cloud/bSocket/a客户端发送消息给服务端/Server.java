package com.cloud.bSocket.a客户端发送消息给服务端;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 14:26
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在9999端口");
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        byte[] temp = new byte[1024];
        int length;
        while ((length = inputStream.read(temp)) != -1) {
            System.out.print(new String(temp, 0, length));
        }

        inputStream.close();
        socket.close();
        serverSocket.close();

    }
}
