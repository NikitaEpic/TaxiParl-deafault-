package org.TaxiPark.ParkController;

import org.TaxiPark.Car.TaxiCar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import org.TaxiPark.Car.ServiceType;

public class Taxi {

    private final CarPark park;

    public Taxi(CarPark park) {
        this.park = park;
    }

    public void MakeOrder() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nChoose the type of service:\n1. Econom\n2. Standart\n3. Business\nYour choice: ");
        int value = scan.nextInt();
        while (value < 0 || value > 3) {
            System.out.println("Invalid request!");
            value = scan.nextInt();
        }
        ServiceType serviceType = ServiceType.getServiceTypeByOrdinal(value);
        ArrayList<TaxiCar> carsByService;
        carsByService = park.CarsByService(serviceType);
        Random random = new Random();
        TaxiCar randomElement = carsByService.get(random.nextInt(carsByService.size()));
        System.out.println("Достпне авто вибраного тарифу: " + randomElement.getCarName());
        System.out.print("Введіть дистанцію проїзду: ");
        value = scan.nextInt();
        assert serviceType != null;
        int cost = value * serviceType.pricePerKM;
        System.out.print("Вартість прїзду складтиме: " + cost + " гривень\n");
    }
}
