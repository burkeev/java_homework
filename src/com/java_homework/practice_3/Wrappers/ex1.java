package com.java_homework.practice_3.Wrappers;

public class ex1 {
    public static void main(String[] args) {
        Double d1 = Double.valueOf("10.5");
        Double d2 = Double.valueOf("16.6");

        // Преобразование строки в double
        String str = "20.7";
        Double d3 = Double.parseDouble(str);

        // Преобразование объекта Double в примитивные типы
        byte b = d1.byteValue();
        short s = d1.shortValue();
        int i = d1.intValue();
        long l = d1.longValue();
        float f = d1.floatValue();
        double d = d1.doubleValue();

        // Вывод значения объекта Double на консоль
        System.out.println(d1);

        // Преобразование литерала double в строку
        String dStr = Double.toString(3.14);
        System.out.println(dStr);


    }

}
