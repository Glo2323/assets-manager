package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class AssetsApp {

    public static void main(String[] args) {
        BigDecimal originalCost = BigDecimal.valueOf(125000);

        Asset house = new House("Small Blue town home", "2025", originalCost, "123 mad lane", 1, 1000, 40);

        System.out.println(house.getValue());

        BigDecimal originalCarCost = BigDecimal.valueOf(20000);

        Asset car = new Vehicle("Red Honda Civic Ek9", "2015", originalCarCost, "Honda Civic", 1999,50000);

        System.out.println(car.getValue());

        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(house);
        assets.add(car);


        for (Asset asset : assets) {

            if (asset.getClass().getSimpleName().equals("House")) {
                House house1 = (House) asset;

                System.out.println(house1.getDescription() + " at " + house1.getAddress() + " was bought " +
                        house1.getDateAcquired() + " and it's value is at " + house1.getValue());
            }else if (asset.getClass().getSimpleName().equals("Vehicle")) {
                Vehicle vehicle = (Vehicle) asset;

                System.out.println( vehicle.getYear() + " " + vehicle.getDescription() + " is valued at " + vehicle.getValue());
            }

        }

    }
}
