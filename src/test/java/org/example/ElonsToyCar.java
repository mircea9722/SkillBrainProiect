package org.example;

public class ElonsToyCar {
    public static void main(String[] args) {
        ElonsToyCar myToyCar = ElonsToyCar.buy("Tesla Model S");
        System.out.println("My toy car model: " + myToyCar.getModelName());

        myToyCar.drive(50);
        System.out.println(myToyCar.distanceDisplay());
        System.out.println(myToyCar.batteryDisplay());
}