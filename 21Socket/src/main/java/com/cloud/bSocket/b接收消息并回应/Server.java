package com.cloud.bSocket.b接收消息并回应;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/23
 * @Time 10:44
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        int length;
        byte[] temp = new byte[1024];
        StringBuffer stringBuffer = new StringBuffer();
        while ((length = inputStream.read(temp)) != -1) {
            stringBuffer.append(new String(temp, 0, length));
        }

        System.out.println("服务端：" + stringBuffer);

        socket.shutdownInput();


        if (stringBuffer.toString().equals("hello, server")) {
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("hello, client".getBytes());
            outputStream.close();
        }

        inputStream.close();
        socket.close();
        serverSocket.close();

    }
}
