package com.java_homework.practice_3.Math_n_Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");

        int size = 1;
        while(true) {
            if (in.hasNextInt()) {
                size = in.nextInt();
                if (size > 0) {
                    break;
                } else {
                    System.out.println("Введите положительное число больше 0: ");
                }
            } else {
                System.out.println("Это не число. Пожалуйста, введите число: ");
                in.next(); // очистка буфера
            }

        }
        // первый массив из случайных чисел
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(new Random().nextInt(1, size));
        }
        System.out.println(Arrays.toString(list.toArray()));

        // второй массив из четных чисел первого
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                evenList.add(list.get(i));
            }
        }
        System.out.println(Arrays.toString(evenList.toArray()));

        in.close();
    }
}
