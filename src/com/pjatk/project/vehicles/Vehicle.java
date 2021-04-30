package com.pjatk.project.vehicles;

public abstract class Vehicle {

    protected double weight;
    protected double engineCap;
    protected String engineType;
    protected String vehicleType;
    protected String vehicleName;


    public Vehicle(double weight, double engineCap, String engineType, String vehicleType, String vehicleName) {
        this.weight = weight;
        this.engineCap = engineCap;
        this.engineType = engineType;
        this.vehicleType = vehicleType;
        this.vehicleName = vehicleName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getEngineCap() {
        return engineCap;
    }

    public void setEngineCap(double engineCap) {
        this.engineCap = engineCap;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "weight=" + weight +
                ", engineCap=" + engineCap +
                ", engineType='" + engineType + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                '}';
    }
}
