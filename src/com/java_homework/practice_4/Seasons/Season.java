package com.java_homework.practice_4.Seasons;

public enum Season {
    WINTER("Зима", -10),
    SPRING("Весна", 10),
    SUMMER("Лето", 25),
    AUTUMN("Осень", 10);

    private final String name;
    private final int avgTemperature;

    Season(String name, int avgTemperature) {
        this.name = name;
        this.avgTemperature = avgTemperature;
    }

    public String getName() {
        return name;
    }

    public int getAvgTemperature() {
        return avgTemperature;
    }

    public String getDescription() {
        if(this == SUMMER) {
            return "Теплое время года";
        }
        else {
            return "Холодное время года";
        }

    }

    public static void printSeasonInfo(Season season) {
        switch (season) {
            case WINTER -> System.out.println("Я люблю зиму");
            case SPRING -> System.out.println("Я люблю весну");
            case SUMMER -> System.out.println("Я люблю лето");
            case AUTUMN -> System.out.println("Я люблю осень");
        }
    }
}



