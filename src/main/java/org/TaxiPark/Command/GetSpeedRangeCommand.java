package org.TaxiPark.Command;

import org.TaxiPark.ParkController.CarPark;

public class GetSpeedRangeCommand implements Command{
    CarPark park;

    public GetSpeedRangeCommand(CarPark park) {
        this.park = park;
    }

    @Override
    public void execute() {
        park.FindSpeedRange();
    }
}
