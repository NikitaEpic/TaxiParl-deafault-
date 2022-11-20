package org.TaxiPark.Command;


import org.TaxiPark.ParkController.CarPark;

public class AddCarCommand implements Command{

    CarPark park;

    public AddCarCommand(CarPark park) {
        this.park = park;
    }
    @Override
    public void execute() {
        park.addCar();
    }

}
