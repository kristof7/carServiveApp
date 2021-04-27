package com.pjatk.project;

import java.util.Objects;

public class ParkingSpace extends Warehouse {

    private int id;
    private static int count;
    private double parkingArea;

    public ParkingSpace(Warehouse warehouse) {
        super(warehouse.getPercentageServiceArea(), warehouse.getArea());
        if (warehouse.getArea() > 0 && warehouse.getAvailableArea() >= parkingArea) {
            this.parkingArea = parkingArea;
            warehouse.setAvailableArea(warehouse.getAvailableArea() - parkingArea);
        } else {
            parkingArea = 0;
        }
        this.setParkingArea(warehouse.getAvailableArea());

        count++;
        id = count;
    }

    public void reserveParkingSpace(double area) {
        if (area > 0) {
            this.setParkingArea(parkingArea - area);
        } else {
            System.out.println("Wrong value, type number grater than 0!");
        }
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
}
