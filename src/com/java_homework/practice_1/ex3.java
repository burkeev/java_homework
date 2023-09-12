package com.java_homework.practice_1;

public class ex3 {
    public static void main(String[] args) {
        int list[] = {3, 5, 8, 10, 7, 4, 6, 5, 3, 2};
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum = sum + list[i];
        }
        double answer = (double) sum / list.length;
        System.out.println(answer);
    }
}
