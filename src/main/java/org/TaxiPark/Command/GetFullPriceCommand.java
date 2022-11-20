package org.TaxiPark.Command;

import org.TaxiPark.ParkController.CarPark;

public class GetFullPriceCommand implements Command {
    CarPark park;

    public GetFullPriceCommand(CarPark park) {
        this.park = park;
    }

    @Override
    public void execute() {
        park.FindFullPrice();
    }
}
