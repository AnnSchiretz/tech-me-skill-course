package com.teachmeskill.hometask5.Car;

public class CarSpecification {
    public int id;
    public String mark;
    public String model;
    public int yearOfCarManufacture;
    public String color;
    public int price;
    public int registrationNumber;

    @Override
    public String toString() {
        return "CarSpecification{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", yearOfCarManufacture=" + yearOfCarManufacture +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNumber=" + registrationNumber +
                '}';
    }

    public CarSpecification(int id, String mark, String model, int yearOfCarManufacture, String color, int price, int registrationNumber) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.yearOfCarManufacture = yearOfCarManufacture;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }
}
