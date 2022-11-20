package org.TaxiPark.Car;

public abstract class Car {
    protected String carName;
    protected int maxSpeed;
    protected int tankCapacity;
    protected double engineCapacity;
    protected int price;
    protected int year;
    protected double fuelConsumptPH;
    protected FuelType typeFuel;
    protected ModelType typeModel;

    public Car(String carName, int maxSpeed, int tankCapacity,double engineCapacity, int price, int year, double fuelConsumptPH, FuelType typeFuel, ModelType typeModel) {
        this.carName = carName;
        this.maxSpeed = maxSpeed;
        this.tankCapacity = tankCapacity;
        this.engineCapacity = engineCapacity;
        this.price = price;
        this.year = year;
        this.fuelConsumptPH = fuelConsumptPH;
        this.typeFuel = typeFuel;
        this.typeModel = typeModel;
    }

    public String getCarName() {return carName;}

    public void setCarName(String carName) {this.carName = carName;}

    public int getMaxSpeed() {return maxSpeed;}

    public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;}

    public double getTankCapacity() {return tankCapacity;}

    public void setTankCapacity(int tankCapacity) {this.tankCapacity = tankCapacity;}

    public double getEngineCapacity() {return engineCapacity;}

    public void setEngineCapacity(double engineCapacity) {this.engineCapacity = engineCapacity;}

    public double getPrice() {return price;}

    public void setPrice(int price) {this.price = price;}

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}

    public double getFuelConsumptPH() {return fuelConsumptPH;}

    public void setFuelConsumptPH(double fuelConsumptPH) {this.fuelConsumptPH = fuelConsumptPH;}

    public FuelType getTypeFuel() {return typeFuel;}

    public void setTypeFuel(FuelType typeFuel) {this.typeFuel = typeFuel;}

    public ModelType getTypeModel() {return typeModel;}

    public void setTypeModel(ModelType typeModel) {this.typeModel = typeModel;}

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", tankCapacity=" + tankCapacity +
                ", engineCapacity=" + engineCapacity +
                ", price=" + price +
                ", year=" + year +
                ", fuelConsumptPH=" + fuelConsumptPH +
                ", typeFuel='" + typeFuel + '\'' +
                ", typeModel='" + typeModel + '\'' +
                '}';
    }
}


