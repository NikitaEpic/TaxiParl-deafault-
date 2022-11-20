package org.TaxiPark.Car;

public enum FuelType {

   PETROL,
    GAS,
    HYBRID;

    public static FuelType getFuelTypeByOrdinal(int ordinal) {
        if(ordinal < 0 || ordinal > FuelType.values().length)
            throw new IllegalArgumentException("You entered Illegal argument!");
        for(FuelType val : FuelType.values()) {
            if(val.ordinal() == ordinal-1) {
                return val;
            }
        }
        return null;
    }

}

