package com.cloud.bSocket.c字符流接收消息并回应;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/23
 * @Time 12:00
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        OutputStream outputStream = socket.getOutputStream();
        // 转换流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("饭吃了吗");

        // 发送
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String temp;
        while ((temp = bufferedReader.readLine()) != null) {
            System.out.println(temp);
        }


        bufferedReader.close();
        inputStream.close();
        outputStream.close();
        socket.close();


    }
}
