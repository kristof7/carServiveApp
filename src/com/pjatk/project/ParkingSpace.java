package com.pjatk.project;

import com.pjatk.project.exceptions.TooManyThingsException;
import com.pjatk.project.vehicles.Vehicle;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class ParkingSpace extends Warehouse {

    private int id;
    private static int count;
    private double parkingArea;
    private double availableParkingArea;
    private String parkingSpaceRentDate;
    public ArrayList<Vehicle> vechicles = new ArrayList<>();

    public ParkingSpace(Warehouse warehouse, double parkingArea) {
        super(warehouse.getPercentageServiceArea(), warehouse.getArea());
        parkingSpaceRentDate = printActualDate();
        if (parkingArea <= warehouse.getAvailableArea())
        this.parkingArea = parkingArea;
        else {
            System.out.println("Sorry, but there is no available space to create this parking space");
            this.parkingArea = warehouse.getAvailableArea();
        }
        if (warehouse.getArea() > 0 && warehouse.getAvailableArea() >= parkingArea) {
            warehouse.setAvailableArea(warehouse.getAvailableArea() - parkingArea);
        } else {
            parkingArea = 0;
        }
        this.availableParkingArea = parkingArea;
        super.setAvailableArea(warehouse.getAvailableArea() - parkingArea);
        count++;
        id = count;
    }

    public ParkingSpace() {
        super();
    }

    public void addVechicleToParkingSpace(Vehicle vehicle, ParkingSpace parkingSpace) throws TooManyThingsException {
        if(parkingSpace.getAvailableArea() >= vehicle.getWeight()) {
            parkingSpace.vechicles.add(vehicle);
            parkingSpace.setAvailableParkingArea(parkingSpace.getAvailableParkingArea() - vehicle.getWeight());
        } else {
            throw new TooManyThingsException();
        }
    }
    public void removeVechicleToParkingSpace(Vehicle vechicle) {
            vechicles.remove(vechicle);
            setAvailableParkingArea(getAvailableParkingArea() + vechicle.getWeight());
    }

    public String printActualDate() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }

    // -------- getters & setters ---------


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getParkingArea() {
        return parkingArea;
    }

    public void setParkingArea(double parkingArea) {
        this.parkingArea = parkingArea;
    }


    public double getAvailableParkingArea() {
        return availableParkingArea;
    }

    public void setAvailableParkingArea(double availableParkingArea) {
        this.availableParkingArea = availableParkingArea;
    }

    public ArrayList<Vehicle> getVechicles() {
        return vechicles;
    }

    public void setVechicles(ArrayList<Vehicle> vechicles) {
        this.vechicles = vechicles;
    }


    // -------- equals & hascode ---------


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingSpace that = (ParkingSpace) o;
        return id == that.id && Double.compare(that.parkingArea, parkingArea) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parkingArea);
    }

    public void printParkingSpace()
    {
        System.out.println("Parking space:");
        System.out.println(id);
        System.out.println(ParkingSpace.count);
        System.out.println(parkingArea);
    }
}
