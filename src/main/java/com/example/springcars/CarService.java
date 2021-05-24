package com.example.springcars;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> carList;

    public CarService() {
        Car car1 = new Car("BMW", "i8");
        Car car2 = new Car("Fiat", "PANDA");
        Car car3 = new Car("FSO", "Polonez");
        carList = new ArrayList<Car>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
    }

    public List<Car> getCars() {
        return carList;
    }
}
