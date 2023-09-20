package com.java_homework.practice_4.Studio;
import java.util.Scanner;
import java.util.Arrays;
public class Shop {
    public static void main(String[] args) {
        System.out.println("Введите логин: ");
        Scanner in = new Scanner(System.in);
        String login = in.nextLine();
        System.out.println("Введите пароль: ");
        String password = in.nextLine();
        System.out.println("Добро пожаловать, " + login);

        while (true) {
            System.out.println("Выберите каталог для просмотра товаров: ");
            for (Catalog catalog : Catalog.values()) {
                System.out.println(catalog.ordinal() + ": " + catalog);
            }

            int catalogChoice = in.nextInt();
            Catalog chosenCatalog = Catalog.values()[catalogChoice];
            System.out.println("Вы выбрали каталог " + chosenCatalog);
            System.out.println("Список товаров: " + chosenCatalog.getProductsAsString());

            System.out.println("Введите название товара для добавления в корзину: ");
            String productChoice = in.next();
            if (Arrays.asList(chosenCatalog.getProducts()).contains(productChoice)) {
                System.out.println("Товар " + productChoice + " добавлен в корзину");
            } else {
                System.out.println("Выбранный товар не найден в каталоге");
                continue;
            }

            System.out.println("Желаете совершить покупку? (да/нет)");
            String buyChoice = in.next();

            if (buyChoice.equalsIgnoreCase("да")) {
                System.out.println("Спасибо за покупку!");
            }

            System.out.println("Желаете купить что-нибудь еще? (да/нет)");
            buyChoice = in.next();
            if (!buyChoice.equalsIgnoreCase("да")) {
                break;
            }
        }
    }
}