package com.pjatk.project;

public class Person {

    String name;
    String surname;

    public void reserveCustomerWarehouseArea(CustomerWarehouse customerWarehouse, double area) {

        if (customerWarehouse.getWarehouseArea() > area && area > 0) {

            customerWarehouse.reserveWarehouseArea(area);
            System.out.println("You reserved " + area + " of customer's Warehouse area. Available area left: " + customerWarehouse.getWarehouseArea());
        } else {
            System.out.println("Sorry, but there is no available area to reserve");
        }
    }

    public void reserveParkingSpace(ParkingSpace parkingSpace, double area) {

        if (parkingSpace.getAvailableArea() > area && area > 0) {

            parkingSpace.reserveParkingSpace(area);
            System.out.println("You reserved " + area + " of customer's parking space. Available space left: " + parkingSpace.getParkingArea());
        } else {
            System.out.println("Sorry, but there is no available area to reserve");
        }
    }
}
