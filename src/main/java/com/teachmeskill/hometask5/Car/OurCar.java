package com.teachmeskill.hometask5.Car;

public class OurCar {

    public static void main(String[] args){
        CarSpecification[] Car = new CarSpecification[8];
        createCar(Car);
        String disareMark = "Audi";
        OutputCar.sortMarkCar(Car, disareMark);
        String disareModel = "A1";
        OutputCar.sortModelCar(Car, disareModel);
        int operatingTime = 7;
        OutputCar.findOperatingTimeCar(Car, operatingTime);
        int relaseDate = 2015;
        int carPrice = 7000;
        OutputCar.findDateOfIssue(Car, relaseDate,carPrice);
        for (int i = 0; i < Car.length; i ++){
            System.out.println(Car[2]);
        }
    }
    public static void createCar(CarSpecification[] Car){
        Car[0] = new CarSpecification(1, "Volkswagen", "Polo", 2013, "blue", 10000, 43667);
        Car[1] = new CarSpecification(2, "BMW", "X6", 2018, "black", 32000, 788862);
        Car[2] = new CarSpecification(3,"Opel","Astra", 2006, "space gray", 3400, 66355);
        Car[3] = new CarSpecification(4, "Volvo", "S60", 2019, "red", 36000, 663732);
        Car[4] = new CarSpecification(5, "Audi", "A1", 2014, "yellow", 8000, 52652);
        Car[5] = new CarSpecification(6, "Chevrolet", "Camaro", 2017, "green", 24300, 898821);
        Car[6] = new CarSpecification(7, "Opel", "Vectra", 2012, "brown", 9000, 8734834);
        Car[7] = new CarSpecification(5, "Audi", "A3", 2009, "orange", 10000, 52602);
    }
}
