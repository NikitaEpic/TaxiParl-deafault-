package org.TaxiPark.Command;

import org.TaxiPark.ParkController.CarPark;

public class SortCarParkCommand implements Command{
    CarPark park;

    public SortCarParkCommand(CarPark park) {
        this.park = park;
    }

    @Override
    public void execute() {
        park.sortByConsumption();
    }
}
