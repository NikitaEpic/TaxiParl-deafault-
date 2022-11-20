package org.TaxiPark.Command;

import org.TaxiPark.ParkController.CarPark;
import org.TaxiPark.ParkController.Taxi;

public class JourneyCostCommand implements Command {
    Taxi park;

    public JourneyCostCommand(Taxi park) {
        this.park = park;
    }

    @Override
    public void execute() { park.MakeOrder(); }
}
