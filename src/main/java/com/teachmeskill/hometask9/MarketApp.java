package com.teachmeskill.hometask9;

public class MarketApp {
    public static void main(String[] args) {
        Product apple = new Product(888, "apple", 88);
        Product carrot = new Product(844, "carrot", 84);
        Product potatoes = new Product(777, "potatoes", 50);
        Product banana = new Product(999, "banana", 66);
        Market prostore = new Market();
        PriceProductComparator comparator = new PriceProductComparator();
        prostore.addProduct(apple);
        prostore.addProduct(banana);
        prostore.addProduct(potatoes);
        prostore.addProduct(carrot);
        prostore.getProducts().forEach(System.out::println);
        prostore.getProducts().sort(comparator);
        System.out.println("Продукты после сортировки : ");
        prostore.getProducts().forEach(System.out::println);
        prostore.deleteProduct(banana.getId());
        System.out.println("Продукты после удаления одного из продуктов : ");
        prostore.getProducts().forEach(System.out::println);
        prostore.reverseProduct();
        System.out.println("Продукты после сортировки : ");
        prostore.getProducts().forEach(System.out::println);
        potatoes.setName("another product");
        System.out.println("Список продуктов после изменения одного из них :");
        prostore.getProducts().forEach(System.out::println);


    }
}
