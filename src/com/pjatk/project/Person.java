package com.pjatk.project;

import java.util.Date;

public class Person {

    String name;
    String surname;
    String pesel;
    String dateOfBirth;


    public Person(String name, String surname, String pesel, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.dateOfBirth = dateOfBirth;
    }

    public CustomerWarehouse reserveCustomerWarehouseArea(CustomerWarehouse customerWarehouse, double area) {
        CustomerWarehouse newCustomerWarehouse = new CustomerWarehouse();
        if (customerWarehouse.getWarehouseArea() > area && area > 0) {
            newCustomerWarehouse.setWarehouseArea(area);
            newCustomerWarehouse.setAvailableArea(area);
            customerWarehouse.setAvailableArea(customerWarehouse.getAvailableArea() - newCustomerWarehouse.getWarehouseArea());
            System.out.println("You reserved " + area + " of customer's Warehouse area. Available area left: " + customerWarehouse.getWarehouseArea());
        } else {
            System.out.println("Sorry, but there is no available area to reserve");
        }
        return customerWarehouse;
    }

    public ParkingSpace reserveParkingSpace(ParkingSpace parkingSpace, double area) {
        ParkingSpace newParkingSpace = new ParkingSpace();
        if (parkingSpace.getParkingArea() > area && area > 0) {
            newParkingSpace.setParkingArea(area);
            newParkingSpace.setAvailableParkingArea(area);
            parkingSpace.setAvailableParkingArea(parkingSpace.getAvailableParkingArea() - newParkingSpace.getParkingArea());
            System.out.println("You reserved " + area + " of customer's parking space. Available space left: " + parkingSpace.getAvailableParkingArea());
        } else {
            System.out.println("Sorry, but there is no available area to reserve");
        }
        return parkingSpace;
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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
