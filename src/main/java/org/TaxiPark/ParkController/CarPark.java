package org.TaxiPark.ParkController;

import org.TaxiPark.Car.FuelType;
import org.TaxiPark.Car.ModelType;
import org.TaxiPark.Car.ServiceType;
import org.TaxiPark.Car.TaxiCar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CarPark {
    private ArrayList<TaxiCar> cars;
    Scanner scanner = new Scanner(System.in);

    public CarPark() {
        cars = new ArrayList<>();
        cars = init();
    }

    public ArrayList<TaxiCar> getCars() {
        return cars;
    }

    public void setCars(ArrayList<TaxiCar> cars) {
        this.cars = cars;
    }

    public ArrayList init() {
        cars.add(new TaxiCar("Daewoo Lanos", 170, 40, 1.5, 2500, 1999, 6.7, FuelType.PETROL, ModelType.SEDAN, ServiceType.ECONOM));
        cars.add(new TaxiCar("Renault Logan", 175, 50, 1.6, 5000, 2012, 7.2, FuelType.PETROL, ModelType.SEDAN, ServiceType.ECONOM));
        cars.add(new TaxiCar("Toyota Prius", 180, 45, 1.8, 8200, 2011, 3.9, FuelType.HYBRID, ModelType.HATCHBACK, ServiceType.ECONOM));
        cars.add(new TaxiCar("Ford Fusion", 170, 51, 2.0, 11200, 2015, 5.6, FuelType.HYBRID, ModelType.SEDAN, ServiceType.STANDART));
        cars.add(new TaxiCar("Toyota RAV4", 185, 60, 2.0, 18000, 2016, 8.8, FuelType.GAS, ModelType.CROSSOVER, ServiceType.STANDART));
        cars.add(new TaxiCar("Fiat Doblo", 161, 60, 1.4, 11500, 2016, 7.2, FuelType.PETROL, ModelType.SEDAN, ServiceType.STANDART));
        cars.add(new TaxiCar("Volkswagen Passat B7", 220, 70, 1.8, 12600, 2014, 7.0, FuelType.PETROL, ModelType.STATION_WAGON, ServiceType.STANDART));
        cars.add(new TaxiCar("Toyota Camry Prestige", 210, 60, 2.0, 33500, 2021, 6.8, FuelType.PETROL, ModelType.SEDAN, ServiceType.BUSINESS));
        cars.add(new TaxiCar("Porsche Cayenne", 230, 85, 3.6, 42000, 2016, 9.2, FuelType.PETROL, ModelType.CROSSOVER, ServiceType.BUSINESS));
        cars.add(new TaxiCar("Mercedes-Benz E-Class", 233, 66, 2.0, 40500, 2016, 7.3, FuelType.PETROL, ModelType.SEDAN, ServiceType.BUSINESS));
        cars.add(new TaxiCar("KIA Cerato 2TD", 310, 48, 1.6, 7000, 2009, 22.0, FuelType.GAS, ModelType.SEDAN, ServiceType.BUSINESS));
        return cars;
    }

    public void addCar() {
        supplierRealisation();
    }

    public void supplierRealisation() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the brand and model of the car: ");
        String name = scan.nextLine();
        System.out.print("\nEnter max speed: ");
        int maxSpeed = scan.nextInt();
        System.out.print("\nEnter tank capacity: ");
        int tankCapacity = scan.nextInt();
        System.out.print("\nEnter engine capacity: ");
        double engineCapacity = scan.nextDouble();
        System.out.print("\nEnter price: ");
        int price = scan.nextInt();
        System.out.print("\nEnter year of production: ");
        int year = scan.nextInt();
        System.out.print("\nEnter fuel consumption per 100 km: ");
        double fuelConsumtPH = scan.nextDouble();
        System.out.println("\nChoose the type of fuel:\n1. Petrol\n2. Gas\n3. Hybrid\nYour choice: ");
        int value = scan.nextInt();
        while (value < 0 || value > 3) {
            System.out.println("Invalid request!");
            value = scan.nextInt();
        }
        FuelType fuelType = FuelType.getFuelTypeByOrdinal(value);
        System.out.println("\nChoose the type of model:\n1. Sedan\n2. Hatchback\n3. Crossover\n4. Wagon\nYour choice: ");
        value = scan.nextInt();
        while (value < 0 || value > 4) {
            System.out.println("Invalid request!");
            value = scan.nextInt();
        }
        ModelType modelType = ModelType.getModelTypeByOrdinal(value);

        System.out.println("\nChoose the type of service:\n1. Econom\n2. Standart\n3. Business\nYour choice: ");
        value = scan.nextInt();
        while (value < 0 || value > 3) {
            System.out.println("Invalid request!");
            value = scan.nextInt();
        }
        ServiceType serviceType = ServiceType.getServiceTypeByOrdinal(value);

        TaxiCar nCar = new TaxiCar(name, maxSpeed, tankCapacity, engineCapacity, price, year, fuelConsumtPH, fuelType, modelType, serviceType);
        cars.add(nCar);
    }

    public void showAllCars() {
        for (TaxiCar car : cars) {
            System.out.println(car);
        }
    }

    public void FindFullPrice() {
        double sum = 0;
        for (TaxiCar car : cars) {
            sum = sum + car.getPrice();
        }
        System.out.println("Загальна вартість автопарку: " + sum + "$");
    }

    public void sortByConsumption() {
        cars.sort(Comparator.comparingDouble(TaxiCar::getFuelConsumptPH));
        for (TaxiCar car : cars) {
            System.out.printf("FuelConsumption of %s: " + "\t%s", car.getCarName(), car.getFuelConsumptPH());
            System.out.println();
        }
        System.out.println("Сортування виконано успішно");

    }

    public void FindSpeedRange() {
        System.out.print("Enter the lower speed limit: ");
        int minSpeed = scanner.nextInt();
        System.out.print("Enter the upper speed limit: ");
        int maxSpeed = scanner.nextInt();
        while (maxSpeed < minSpeed) {
            System.out.println("Entered wrong data! \n" +
                    "Max speed must have a greater value than min speed. \n" +
                    "Enter max speed again: \n");
            maxSpeed = scanner.nextInt();
        }
        System.out.println("Cars of entered speed diaposon:");
        for (TaxiCar car : cars) {
            if (car.getMaxSpeed() >= minSpeed && car.getMaxSpeed() <= maxSpeed) {
                System.out.printf("%s: %s (km/h)\n", car.getCarName(), car.getMaxSpeed());
            }
        }
    }

    public ArrayList<TaxiCar> CarsByService(ServiceType val){

        ArrayList<TaxiCar> sCar = new ArrayList<>();
        for (TaxiCar car : cars) {
            if(car.getServiceType() == val){
                sCar.add(car);
            }
        }
         return sCar;

    }
}

