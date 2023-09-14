package com.java_homework.practice_2.practice_2_7;

public class Book {
    private String author;
    private String title;
    private String genre;
    private int year;

    public Book(String author, String title, String genre, int year) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override public String toString() {

        return "Книга: " + title + "\nАвтор: " + author + "\nЖанр: " + genre + "\nГод: " + year;
    }







}
