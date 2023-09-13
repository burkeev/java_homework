package com.java_homework.practice_2_2;
import java.util.Scanner;
public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точки: ");
        ball.setX(scanner.nextDouble());
        ball.setY(scanner.nextDouble());
        System.out.println(ball.toString());

        System.out.println("Введите, насколько переместиться точка: ");
        ball.move(scanner.nextDouble(), scanner.nextDouble());
        System.out.println(ball.toString());




    }
}
