package org.TaxiPark.Menu;

import org.TaxiPark.Command.Receiver;
import org.TaxiPark.ParkController.CarPark;
import org.TaxiPark.ParkController.Taxi;

import java.util.Scanner;



public class OwnerMenu {
    private final CarPark park = new CarPark();
    private final Taxi taxi = new Taxi(park);
    private final Scanner scanner = new Scanner(System.in);
    private final Receiver receiver = new Receiver(park, taxi);
    public void showMenu(){
        int value;
        System.out.println("Taxi park by Nikita Homaniuk KN-206");
        System.out.print("--------------------------Taxi Park--------------------------");
        do {
            menu();
            value = scanner.nextInt();
            if (value-1 >= 0 && value-1 <= 6) {
                receiver.run(value - 1);
            }
        } while (true);
    }

    static void menu(){
        System.out.println("\n1.Show all cars in car park:");
        System.out.println("2.Add a car to the car park");
        System.out.println("3.Get price of the car park");
        System.out.println("4.Sort the car park by fuel consumption");
        System.out.println("5.Cars of the selected speed range");
        System.out.println("6.Count price of taxi journey");
        System.out.println("7.Exit\n");
        System.out.print("Your choice: ");
    }
}


