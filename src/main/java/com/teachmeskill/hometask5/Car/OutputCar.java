package com.teachmeskill.hometask5.Car;

public class OutputCar {
    public static void sortMarkCar(CarSpecification[] Car, String mark) {
        for (int i = 0; i < Car.length; i++) {
            if (Car[i].mark == mark) {
                System.out.println("Марка автомобилей " + Car[i].mark);
            }
        }
    }

    public static void sortModelCar(CarSpecification[] Car, String model) {
        for (int i = 0; i < Car.length; i++) {
            if (Car[i].model == model) {
                System.out.println("Модели автомобилей " + Car[i].model);
            }
        }
    }

    public static void findOperatingTimeCar(CarSpecification[] Car, int operatingTime) {
        for (int i = 0; i < Car.length; i++) {
            if ((2020 - Car[i].yearOfCarManufacture) > operatingTime) {
                System.out.println("Машины,которые эксплуатируются меньше, чем " +operatingTime+" лет : " +Car[i].yearOfCarManufacture);
            }
        }
    }

    public static void findDateOfIssue(CarSpecification[] Car, int relaseDate, int carPrice) {
        for (int i = 0; i < Car.length; i++) {
            if (Car[i].yearOfCarManufacture > relaseDate) {
                System.out.println("Машины, которые были выпущены позже,чем " + relaseDate +" год : "+ Car[i].yearOfCarManufacture);
            }
        }
        for (int i = 0; i < Car.length; i++) {
            if (Car[i].price > carPrice) {
                System.out.println("Цена машин, которая меньше заданной цены " + Car[i].price);
            }
        }
    }
}
