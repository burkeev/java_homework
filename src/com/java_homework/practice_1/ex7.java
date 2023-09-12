package com.java_homework.practice_1;
import java.math.*;
public class ex7 {
        public static void main(String[] args) {
            compute(123);
        }

        public static void compute(int n) {
            BigInteger result = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            System.out.println(result);
        }
}
