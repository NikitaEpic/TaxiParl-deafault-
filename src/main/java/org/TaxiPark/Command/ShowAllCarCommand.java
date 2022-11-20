package org.TaxiPark.Command;

import org.TaxiPark.ParkController.CarPark;

public class ShowAllCarCommand implements Command {
    CarPark park;

    public ShowAllCarCommand(CarPark park) {
        this.park = park;
    }
    @Override
    public void execute() {
        park.showAllCars();
    }
}
