package com.pluralsight;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, BigDecimal originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

   @Override
    public BigDecimal getValue(){
        BigDecimal value = BigDecimal.ZERO;
       LocalDate currentDate = LocalDate.now();

       int carYear = currentDate.getYear() - year;

       if (carYear <=  3 ){
           value = getOriginalCost().subtract(getOriginalCost().multiply(BigDecimal.valueOf(.03)));
       }
       else if (carYear <=  6 ){
           value = getOriginalCost().subtract(getOriginalCost().multiply(BigDecimal.valueOf(.06)));
       }
       else if (carYear <=  10 ){
           value = getOriginalCost().subtract(getOriginalCost().multiply(BigDecimal.valueOf(.08)));
       }
       else if (carYear >  10 ){
           value = BigDecimal.valueOf(1000);
       }


        return value;
   }
}
