package org.TaxiPark.Test;

import org.TaxiPark.Car.FuelType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuelTypeTest {
    @Test
    @DisplayName("Obtaining the gasoline type by index")
    void getTypeByOrdinal() {
        assertEquals(FuelType.PETROL,FuelType.getFuelTypeByOrdinal(1));
        assertEquals(FuelType.GAS,FuelType.getFuelTypeByOrdinal(2));
        assertEquals(FuelType.HYBRID,FuelType.getFuelTypeByOrdinal(3));

    }
    @Test
    @DisplayName("Exception: Obtaining the car type by index")
    void getTypeByOrdinalException(){
        try {
            FuelType.getFuelTypeByOrdinal(-1);
            fail(); // if we got here, no exception was thrown, which is bad
        }
        catch (Exception e) {
            final String expected = "You entered Illegal argument!";
            assertEquals( expected, e.getMessage());
        }
    }
}