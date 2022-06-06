package com.example.tpo5_wd_s22980.Models;

import java.time.Year;

public class Car {
    public String brand;
    public Year productionYear;
    public String type;
    public int fuelUse;

    public Car(String brand, Year productionYear, String type, int fuelUse) {
        this.brand = brand;
        this.productionYear = productionYear;
        this.type = type;
        this.fuelUse = fuelUse;
    }

}
