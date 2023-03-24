package com.cloud;

public class Recursion01 {
    public static void main(String[] args) {
        Fei fei = new Fei();
        fei.eat(10);
        System.out.println(fei.total);
    }
}

class Fei {
    int total = 1;

    public int feibo(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return feibo(n - 1) + feibo(n - 2);
        }
    }


    public int eat(int day) {
        if (day > 1) {
            total = (total + 1) * 2;
            return eat(day - 1);
        }
        return -1;
    }

}



