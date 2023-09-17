package com.java_homework.practice_4.Seasons;

public class Main {
    public static void main(String[] args) {
        Season myFavSeason = Season.SUMMER;
        System.out.println("Мое любимое время года: " + myFavSeason.getName());
        System.out.println("Средняя температура: " + myFavSeason.getAvgTemperature());
        System.out.println("Описание: " + myFavSeason.getDescription());

        Season.printSeasonInfo(myFavSeason);

        for(Season season : Season.values()) {
            System.out.println(season.getName() + " " + season.getAvgTemperature() + " " + season.getDescription());
        }

    }
}
