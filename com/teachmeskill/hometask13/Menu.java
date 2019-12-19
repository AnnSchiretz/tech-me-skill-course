package com.teachmeskill.hometask13;

import java.util.Objects;

public class Menu {
    private String name;
    private String price;
    private String description;
    private int calories;

    public Menu() {

    }

    public Menu(String name, String price, String description, int calories) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return calories == menu.calories &&
                Objects.equals(name, menu.name) &&
                Objects.equals(price, menu.price) &&
                Objects.equals(description, menu.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description, calories);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", calories=" + calories +
                '}';
    }
}
