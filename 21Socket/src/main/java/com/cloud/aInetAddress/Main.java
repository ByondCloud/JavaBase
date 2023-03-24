package com.cloud.aInetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 14:12
 */
public class Main {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机 InetAddress 对象 getLocalHost
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("获取本机ip和主机名: " + localHost);

        //根据指定主机名/域名获取 ip 地址对象 getByName
        InetAddress host2 = InetAddress.getByName("KK-5800");
        System.out.println("根据主机名获取主机ip和主机名: " + host2);

        InetAddress host3 = InetAddress.getByName("www.baidu.com");
        System.out.println("根据域名获取主机ip和主机名: " + host3);

        //获取 InetAddress 对象的主机名 getHostName
        String host3Name = localHost.getHostName();
        System.out.println("获取本机名: " + host3Name);

        //获取 InetAddress 对象的地址 getHostAddress
        String host3Address = host3.getHostAddress();
        System.out.println("获取本机ip: " + host3Address);
    }
}
