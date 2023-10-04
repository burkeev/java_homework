package com.java_homework.practice_4.Studio;
import java.util.Scanner;
public class Shop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите логин: ");
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
            boolean productExists = false;
            for (String product : chosenCatalog.getProducts()) {
                if (product.equalsIgnoreCase(productChoice)) {
                    productExists = true;
                    break;
                }
            }
            if (!productExists) {
                System.out.println("Такого товара не существует");
            }

            if (productExists) {
                System.out.println("Товар добавлен в корзину");
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