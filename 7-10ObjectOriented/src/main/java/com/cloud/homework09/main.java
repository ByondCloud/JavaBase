package com.cloud.homework09;

public class main {
    public static void main(String[] args) {
        new LabeledPoint("black", 10, 15);
    }
}


class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class LabeledPoint extends Point {
    public String title;

    public LabeledPoint(String title, double x, double y) {
        super(x, y);
    }
}
