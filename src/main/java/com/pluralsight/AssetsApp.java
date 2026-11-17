package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class AssetsApp {

    public static void main(String[] args) {
        BigDecimal originalCost = BigDecimal.valueOf(125000);

        Asset house = new House("Small Blue town home", "2025", originalCost, "123 mad lane", 1, 1000, 40);
        Asset house2 = new House(
                "Large Brick Family Home",
                "2023",
                new BigDecimal("325000.00"),
                "456 Oak Street",
                4,
                2800,
                30
        );

        Asset house3 = new House(
                "Modern Lakefront Cabin",
                "2024",
                new BigDecimal("210000.00"),
                "789 Lake View Drive",
                2,
                1500,
                50
        );



        BigDecimal originalCarCost = BigDecimal.valueOf(20000);

        Asset car = new Vehicle("Red Honda Civic Ek9", "2015", originalCarCost, "Honda Civic", 1999,50000);

        Asset car2 = new Vehicle(
                "Silver Toyota Camry",
                "2020",
                new BigDecimal("22000.00"),
                "Toyota Camry",
                2019,
                40000
        );

        Asset car3 = new Vehicle(
                "White Ford F-150",
                "2023",
                new BigDecimal("38000.00"),
                "Ford F-150",
                2022,
                12000
        );


        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(house);
        assets.add(car);
        assets.add(house2);
        assets.add(car2);
        assets.add(house3);
        assets.add(car3);


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
