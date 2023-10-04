package com.java_homework.practice_4.Studio;

public enum Catalog {
    Food("Яблоко", "Хлеб"),
    Clothes("Футболка", "Джинсы"),
    Electronics("Телефон", "Ноутбук");

    private final String[] products;

    Catalog(String... products) {
        this.products = products;
    }

    public String[] getProducts() {
        return products;
    }

    //возвращает строку содержающую продукты, разделенные запятой
    public String getProductsAsString() {
        return String.join(", ", products);
    }
}

