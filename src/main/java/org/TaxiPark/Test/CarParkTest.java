package org.TaxiPark.Test;

import org.TaxiPark.Car.ServiceType;
import org.TaxiPark.Car.TaxiCar;
import org.TaxiPark.ParkController.CarPark;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarParkTest {

    @Test
    @DisplayName("Testing car GetCar by service")
    void carsByService() {
        CarPark car = new CarPark();
        List<TaxiCar> list = car.CarsByService(ServiceType.ECONOM);
        assertEquals(3,list.size());

    }

    @Test
    @DisplayName("Testing car sort")
    void sortByConsumption() {
        CarPark cars = new CarPark();
       TaxiCar car = cars.getCars().get(2);
       cars.sortByConsumption();
       assertEquals(car,cars.getCars().get(0));
    }

    @Test
    @DisplayName("Testing getting price")
    void getPrice() {
        double price = 192000;
        CarPark car = new CarPark();
        car.FindFullPrice();
        assertEquals(price,car.getPrice());
    }
}