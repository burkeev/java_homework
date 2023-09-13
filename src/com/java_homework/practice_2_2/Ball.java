package com.java_homework.practice_2_2;

public class Ball {
        private double x = 0.0;
        private double y = 0.0;

        public Ball(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Ball() {

        }

    public double getX() {
        return x;
    }

    void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    void setY(double y) {
        this.y = y;
    }

    void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void move(double xDisp, double yDisp) {
        x = x + xDisp;
        y = y + yDisp;
    }

    @Override public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }




}
