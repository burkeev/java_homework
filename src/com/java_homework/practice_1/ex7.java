package com.java_homework.practice_1;
import java.util.Scanner;
import java.math.*;
public class ex7 {
        public static void main(String[] args) {
            System.out.println("Введите число: ");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            compute(n);
        }

        public static void compute(int n) {
            BigInteger result = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            System.out.println(result);
        }
}
