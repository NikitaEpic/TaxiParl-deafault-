package org.TaxiPark.Test;

import org.TaxiPark.Car.ModelType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ModelTypeTest {

    @Test
    @DisplayName("Obtaining the car model type by index")
    void getTypeByOrdinal() {
        assertEquals(ModelType.SEDAN,ModelType.getModelTypeByOrdinal(1));
        assertEquals(ModelType.HATCHBACK,ModelType.getModelTypeByOrdinal(2));
        assertEquals(ModelType.CROSSOVER, ModelType.getModelTypeByOrdinal(3));
        assertEquals(ModelType.STATION_WAGON, ModelType.getModelTypeByOrdinal(4));
    }
    @Test
    @DisplayName("Exception: Obtaining the car model type by index")
    void getTypeByOrdinalException(){
        try {
            ModelType.getModelTypeByOrdinal(-1);
            fail(); // if we got here, no exception was thrown, which is bad
        }
        catch (Exception e) {
            final String expected = "You entered Illegal argument!";
            assertEquals( expected, e.getMessage());
        }
    }
}