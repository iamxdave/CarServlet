package com.example.tpo5_wd_s22980.Services;

import com.example.tpo5_wd_s22980.Models.Car;

import java.io.*;
import java.time.Year;
import java.util.ArrayList;


public class CarService {

    public ArrayList<Car> getCars() {

        ArrayList<Car> cars = new ArrayList<>();

        try {

            File file = new File(System.getProperty("user.dir") + "/cars.txt");

            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");

                String brand = parts[0];
                Year productionYear = Year.of(Integer.parseInt(parts[1]));
                String type = parts[2];
                int fuelUse = Integer.parseInt(parts[3]);

                cars.add(new Car(brand, productionYear, type, fuelUse));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return cars;
    }

}
