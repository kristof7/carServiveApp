package com.pjatk.project;

import java.util.Date;

public class Person {

    String name;
    String surname;
    String pesel;
    String dateOfBirth;
    Date warehouseRentDate;

    public Person(String name, String surname, String pesel, String dateOfBirth, Date warehouseRentDate) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.dateOfBirth = dateOfBirth;
        this.warehouseRentDate = warehouseRentDate;
    }

    public void reserveCustomerWarehouseArea(CustomerWarehouse customerWarehouse, double area) {
        if (customerWarehouse.getWarehouseArea() > area && area > 0) {
            customerWarehouse.reserveWarehouseArea(area);
            System.out.println("You reserved " + area + " of customer's Warehouse area. Available area left: " + customerWarehouse.getWarehouseArea());
        } else {
            System.out.println("Sorry, but there is no available area to reserve");
        }
    }

    public void reserveParkingSpace(ParkingSpace parkingSpace, double area) {
        if (parkingSpace.getParkingArea() > area && area > 0) {
            parkingSpace.reserveParkingSpace(area);
            System.out.println("You reserved " + area + " of customer's parking space. Available space left: " + parkingSpace.getParkingArea());
        } else {
            System.out.println("Sorry, but there is no available area to reserve");
        }
    }

    public void insertItemToWarehouse(Warehouse warehouse) {
        if (warehouse.getPersonsWithPermission().contains(this)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }


    public void givePermission(Warehouse warehouse, Person person) {
        warehouse.getPersonsWithPermission().add(person);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", warehouseRentDate=" + warehouseRentDate +
                '}';
    }
}
