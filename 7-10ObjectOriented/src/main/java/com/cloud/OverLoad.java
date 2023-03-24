package com.cloud;
// 方法的重载
public class OverLoad {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        int calculator = myCalculator.calculator(1, 2);
        System.out.println(calculator);
    }
}

class MyCalculator {
    public int calculator(int n1, int n2) {
        return n1 + n2;
    }
    public double calculator(int n1, double n2) {
        return n1 + n2;
    }
    public double calculator(double n1, int n2) {
        return n1 + n2;
    }
    public int calculator(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}
