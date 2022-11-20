package org.TaxiPark.Command;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("You exited from menu. Program finished!");
        System.exit(0);
    }
}
