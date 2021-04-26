package com.pjatk.project;

public class ParkingSpace extends Warehouse {

    private int id;
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

    }

    public void reserveParkingSpace(double area) {
        if (area > 0) {
            this.setParkingArea(parkingArea - area);
        } else {
            System.out.println("Wrong value, type number grater than 0!");
        }
    }


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
}
