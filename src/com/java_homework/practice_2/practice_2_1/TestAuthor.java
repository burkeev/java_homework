package com.java_homework.practice_2.practice_2_1;
import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args) {
        String email;

        Author k = new Author("John", "john@me.com", 'M');
        System.out.println("Name: " + k.getName());

        Scanner source = new Scanner(System.in);
        System.out.println("What's your email? ");
        email = source.nextLine();
        k.setEmail(email);

        System.out.println("Email: " + k.getEmail());
        System.out.println("Gender: " + k.getGender());
    }
}
