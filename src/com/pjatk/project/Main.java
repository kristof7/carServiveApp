package com.pjatk.project;

public class Main {

    public static void main(String[] args) {


        Warehouse warehouse = new Warehouse(30, 100);

        CustomerWarehouse customerWarehouse = new CustomerWarehouse(warehouse, 50);
        ParkingSpace parkingSpace = new ParkingSpace(warehouse);

        System.out.println(customerWarehouse.getWarehouseArea());
        System.out.println(parkingSpace.getParkingArea());



        Person person = new Person();

        person.reserveCustomerWarehouseArea(customerWarehouse, 10);

        System.out.println(customerWarehouse.getWarehouseArea());
        person.reserveCustomerWarehouseArea(customerWarehouse, 10);
        person.reserveParkingSpace(parkingSpace, 10);
        System.out.println(parkingSpace.getParkingArea());

        Person person2 = new Person();

        person2.reserveCustomerWarehouseArea(customerWarehouse, 10);


        Person person3 = new Person();

        person3.reserveCustomerWarehouseArea(customerWarehouse, -20);

    }
}
