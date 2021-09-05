package com.compagny;

public class Main {

    public static void main(String[] args) {

        Car chevrolet;
        chevrolet = new Car(4, 4);
        Car mazda;
        mazda = new Car(4, 2);
        Car moto;
        moto = new Car(2 , 0);

        System.out.println("chevrolet has " + chevrolet.getDoors() + " doors");
        System.out.println("mazda has " + mazda.getDoors() + " doors");
        System.out.println("moto has " + moto.getDoors() + " doors");

    }
}
