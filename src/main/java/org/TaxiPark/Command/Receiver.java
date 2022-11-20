
package org.TaxiPark.Command;
import org.TaxiPark.ParkController.CarPark;
import org.TaxiPark.ParkController.Taxi;

import java.util.ArrayList;
import java.util.List;

public class Receiver {
    private final List<Command> commandList = new ArrayList<>();
    private final CarPark park;
    private final Taxi taxi;
    public Receiver(CarPark park, Taxi taxi){
        this.park = park;
        this.taxi = taxi;
        addCommands();
    }

    public void run(int index){
        commandList.get(index).execute();
    }

    public void addCommands(){
        commandList.add(new ShowAllCarCommand(park));
        commandList.add(new AddCarCommand(park));
        commandList.add(new GetFullPriceCommand(park));
        commandList.add(new SortCarParkCommand(park));
        commandList.add(new GetSpeedRangeCommand(park));
        commandList.add(new JourneyCostCommand(taxi));
        commandList.add(new ExitCommand());
    }
}