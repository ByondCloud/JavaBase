package com.cloud.bSocket.a客户端发送消息给服务端;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/** 客户端 发送消息
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 14:22
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        // 通过socket拿到输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello，server".getBytes());
        outputStream.close();
        socket.close();

    }
}
