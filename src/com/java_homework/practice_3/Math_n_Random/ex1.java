package com.java_homework.practice_3.Math_n_Random;
import java.util.Arrays;
import java.util.Random;
public class ex1 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] a = new double[10];
        for (int i = 0; i < 10; i++) {
            a[i] = random.nextDouble(100);
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(
                Arrays.copyOf(a, 5)));
    }
}
