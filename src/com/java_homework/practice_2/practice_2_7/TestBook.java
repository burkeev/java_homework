package com.java_homework.practice_2.practice_2_7;
import java.util.Arrays;
import java.util.Comparator;

public class TestBook {
    static Book[] books = new Book[3];
    public static void main(String[] args) {
            books[0] = new Book("Стивен Кинг", "Война и мир", "фантастика",2019);
            books[1] = new Book("Джоан Роулинг", "Гарри Поттер и философский камень", "фантастика",  2002);
            books[2] = new Book("Сапковский", "Ведьмак", "фэнтэзи",  2014);
            Arrays.sort(books, Comparator.comparing(Book::getYear));
            System.out.println(Arrays.toString(books));
    }
}
