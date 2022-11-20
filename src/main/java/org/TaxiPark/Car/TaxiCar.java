package org.TaxiPark.Car;

public class TaxiCar extends Car {

//double serviceCost;
protected ServiceType serviceType;

 public TaxiCar(String carName, int maxSpeed, int tankCapacity,double engineCapacity, int price, int year, double fuelConsumptPH,
                 FuelType typeFuel, ModelType typeModel, /*double serviceCost, */ ServiceType serviceType)
 {
  super(carName, maxSpeed, tankCapacity, engineCapacity, price, year, fuelConsumptPH, typeFuel, typeModel);
 // this.serviceCost= serviceCost;
  this.serviceType=serviceType;
 }

 public ServiceType getServiceType() {
  return serviceType;
 }

 public void setServiceType(ServiceType serviceType) {
  this.serviceType = serviceType;
 }

 @Override
 public String toString() {
  return "Авто " + '\'' + carName + '\'' + " {" + "Модель = '" + carName + '\'' +
          ", Макс швидкість = " + maxSpeed +
          ", Об'єм баку = " + tankCapacity +
          ", Об'єм двигуна = " + engineCapacity +
          ", Ціна = " + price +
          ", Рік = " + year +
          ", Витрата пального(на 100км) = " + fuelConsumptPH +
          ", Тип палива = " + typeFuel +
          ", Тип кузова = " + typeModel +
          ", Тип сервісу(тариф) = " + serviceType +
          '}';
 }
}
