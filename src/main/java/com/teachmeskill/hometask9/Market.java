package com.teachmeskill.hometask9;

import java.util.*;
import java.util.stream.Stream;

public class Market {

    private List<Product> products = new ArrayList<>();

    public Market() {

    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Market market = (Market) o;
        return Objects.equals(products, market.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "Market{" +
                "products=" + products +
                '}';
    }

    public void addProduct(Product prod) {
        Product existedProduct = products.stream()
                .filter(product -> product.getId() == prod.getId())
                .findFirst()
                .orElse(null);

        if (existedProduct == null) {
            products.add(prod);
        }
    }

    public void deleteProduct(Integer idProduct) {
        products.removeIf(product -> product.getId() == idProduct);
    }

    public void reverseProduct() {
        Collections.reverse(products);
        Collections.reverse(products);
    }
}
