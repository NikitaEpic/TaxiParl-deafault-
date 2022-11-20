package org.TaxiPark.Car;

public enum ServiceType {

    ECONOM(5), STANDART(10), BUSINESS(20);

    public final int pricePerKM;

    ServiceType(int pricePerKM) {
        this.pricePerKM = pricePerKM;
    }
    public static ServiceType getServiceTypeByOrdinal(int ordinal) {
        if(ordinal < 0 || ordinal > ServiceType.values().length)
            throw new IllegalArgumentException("You entered Illegal argument!");
        for(ServiceType val : ServiceType.values()) {
            if(val.ordinal() == ordinal-1) {
                return val;
            }
        }
        return null;
    }
}
