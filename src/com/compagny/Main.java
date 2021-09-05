package com.compagny;

public class Main {

    public static void main(String[] args) {

        Car chevrolet;
        chevrolet = new Car(4, 4);
        Car mazda;
        mazda = new Car(4, 2);


        System.out.println("chevrolet has " + chevrolet.getDoors() + " doors");
        System.out.println("mazda has " + mazda.getDoors() + " doors");


    }
}
