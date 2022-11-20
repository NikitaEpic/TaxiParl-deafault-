package org.TaxiPark.Car;

public enum ModelType {
    SEDAN(4), HATCHBACK(5), CROSSOVER(5), STATION_WAGON(5);

    private final int maxSeats;

    ModelType(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public int getMaxSeats() {
        return maxSeats;
    }
    public static ModelType getModelTypeByOrdinal(int ordinal) {
        if(ordinal < 0 || ordinal > ModelType.values().length)
            throw new IllegalArgumentException("You entered Illegal argument!");
        for(ModelType val : ModelType.values()) {
            if(val.ordinal() == ordinal-1) {
                return val;
            }
        }
        return null;
    }


}
