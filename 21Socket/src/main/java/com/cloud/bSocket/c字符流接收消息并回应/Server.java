package com.cloud.bSocket.c字符流接收消息并回应;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/23
 * @Time 12:13
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String temp;
        while ((temp = bufferedReader.readLine()) != null) {
            System.out.println(temp);
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("吃过了");

        bufferedWriter.close();
        socket.close();
        serverSocket.close();

    }
}
