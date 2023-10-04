package com.java_homework.practice_4.Seasons;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите название сезона: ");
        Scanner source = new Scanner(System.in);
        String season2 = source.nextLine();
        Seasons seasons = Seasons.valueOf(season2.toUpperCase());
        System.out.println(seasons.getFavoriteSeason() + ". Её средняя температура: " + seasons.getAverageTemperature() +"\n");



        for (Seasons season : Seasons.values()) {
            System.out.println(season.getName() + ": " + season.getAverageTemperature() + " градусов. " + season.getDescription());
        }
    }
}
