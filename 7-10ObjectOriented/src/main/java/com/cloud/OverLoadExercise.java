package com.cloud;

public class OverLoadExercise {
    public static void main(String[] args) {
        Methods methods = new Methods();
        double max = methods.max(7.1, 9.9, 5.4);
        System.out.println(max);
        methods.sum(1,2,3,4);

    }
}
class Methods {
    public int m(int m1) {
        return m1 * m1;
    }
    public int m(int m1, int m2) {
        return m1 * m2;
    }
    public String m(String m1) {
        return m1;
    }

    public int max(int m1, int m2) {
        return m1 > m2 ? m1 : m2;
    }
    public double max(double m1, double m2) {
        return m1 > m2 ? m1 : m2;
    }
    public double max(double m1, double m2, double m3) {
        double max = m1 > m2 ? m1 : m2;
        return m3 > max ? m3 : max;
    }


    public int sum(int... nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        System.out.println(total);
        return total;
    }
}
