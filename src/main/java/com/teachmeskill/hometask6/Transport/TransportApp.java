package com.teachmeskill.hometask6.Transport;

public class TransportApp {

    public static void main(String[] args) {
        PassengerTransport myCar = new PassengerTransport(56.66f, 230, 980, "Opel", 4, 8.33f, "sedan body", 5 );
        FreightTransport myTruck = new FreightTransport(78.99f,200,700, "МАЗ", 4, 16.8f, 800);
        CivilAirTransport myPlane = new CivilAirTransport(678.99f, 300, 4000, "Boeing",3,3000, 240, true);
        MilitaryAirTransport myMilitaryPlane = new MilitaryAirTransport(1000, 300, 34000, "Boeing", 3, 6000, false, 4);
        myCar.informationCar();
        myMilitaryPlane.informationMilitaryPlane();
        myTruck.informationTruck();
        myPlane.informationCivilPlane();
        myCar.createDescription(3, myCar.getMark(), myCar.getMaxSpeed());
        myTruck.checkCarryingCapacity(230, myTruck.getCarrying());
        myPlane.checkPassengerCapacity(89, 240);
        myMilitaryPlane.rocketShot(myMilitaryPlane.getAmountRocket());
        myMilitaryPlane.catapultCheck(myMilitaryPlane.isCatapultSystem());
    }
}
