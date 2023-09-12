package com.java_homework.practice_1;
import java.util.ArrayList;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int sum = 0;
        int maximum = -10000;
        int minimum = 10000;
        //прерывается любым другим символом кроме цифр
        System.out.println("Введите числа:");
        while (true) {
            int part = in.nextInt();
            list.add(part);
            in.nextLine();

            sum = sum + part;

            if (part > maximum) {
                maximum = part;
            }
            if (part < minimum) {
                minimum = part;
            }

            if(!(in.hasNextInt())) {
                break;
            }
        }

        System.out.println("Сумма: " + sum);
        System.out.println("Максимум: " + maximum);
        System.out.println("Минимум: " + minimum);
    }
}
