package org.TaxiPark.Test;

import org.TaxiPark.Car.ModelType;
import org.TaxiPark.Car.ServiceType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTypeTest {

        @Test
        @DisplayName("Obtaining the car model type by index")
        void getTypeByOrdinal() {
            assertEquals(ServiceType.ECONOM,ServiceType.getServiceTypeByOrdinal(1));
            assertEquals(ServiceType.STANDART,ServiceType.getServiceTypeByOrdinal(2));
            assertEquals(ServiceType.BUSINESS,ServiceType.getServiceTypeByOrdinal(3));

        }
        @Test
        @DisplayName("Exception: Obtaining the car service type by index")
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
