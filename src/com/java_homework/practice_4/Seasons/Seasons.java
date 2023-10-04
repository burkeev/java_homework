package com.java_homework.practice_4.Seasons;

public enum Seasons {
    SPRING("Весна", 15),
    SUMMER("Лето", 20),
    AUTUMN("Осень", 15),
    WINTER("Зима", -20);

    private final String name;
    private final int averageTemperature;

    Seasons(String name, int averageTemperature) {
        this.name = name;
        this.averageTemperature = averageTemperature;
    }

    Seasons(String name) {
        this.name = name;
        this.averageTemperature = 0;
    }

    public String getName() {
        return name;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getFavoriteSeason() {
        return switch (this) {
            case SPRING -> "Я люблю весну";
            case SUMMER -> "Я люблю лето";
            case AUTUMN -> "Я люблю осень";
            case WINTER -> "Я люблю зиму";
            default -> null;
        };
    }

    public String getDescription() {
        return switch (this) {
            case SPRING, AUTUMN, WINTER -> "Холодное время года";
            case SUMMER -> "Теплое время года";
            default -> null;

        };

    }





}







