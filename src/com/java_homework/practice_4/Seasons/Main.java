package com.java_homework.practice_4.Seasons;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Which season is your favorite? winter/spring/summer/autumn");
        String temporary_season = in.nextLine();
        Season myFavSeason = switch (temporary_season) {
            case "spring" -> Season.SPRING;
            case "summer" -> Season.SUMMER;
            case "autumn" -> Season.AUTUMN;
            default -> Season.WINTER;
        };


        System.out.println("1) Мое любимое время года: " + myFavSeason.getName());
        System.out.println("2) Средняя температура: " + myFavSeason.getAvgTemperature());
        System.out.println("3) Описание: " + myFavSeason.getDescription());

        Season.printSeasonInfo(myFavSeason);

        for(Season season : Season.values()) {
            System.out.println(season.getName() + " " + season.getAvgTemperature() + " " + season.getDescription());
        }

    }
}
