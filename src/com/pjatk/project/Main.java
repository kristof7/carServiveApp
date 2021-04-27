package com.pjatk.project;

public class Main {

    public static void main(String[] args) {




        CarService carService = new CarService(2000);
        Warehouse warehouse1 = new Warehouse(30, 300);
        Warehouse warehouse2 = new Warehouse(20, 150);
        Warehouse warehouse3 = new Warehouse(30, 100);
        Warehouse warehouse4 = new Warehouse(50, 150);
        Warehouse warehouse5 = new Warehouse(40, 170);
        Warehouse warehouse6 = new Warehouse(30, 200);
        Warehouse warehouse7 = new Warehouse(30, 300);
        Warehouse warehouse8 = new Warehouse(30, 100);
        Warehouse warehouse9 = new Warehouse(30, 120);
        Warehouse warehouse10 = new Warehouse(30, 160);
        carService.addWarehouse(warehouse1);
        carService.addWarehouse(warehouse2);
        carService.addWarehouse(warehouse3);
        carService.addWarehouse(warehouse4);
        carService.addWarehouse(warehouse5);
        carService.addWarehouse(warehouse6);
        carService.addWarehouse(warehouse7);
        carService.addWarehouse(warehouse8);
        carService.addWarehouse(warehouse9);
        carService.addWarehouse(warehouse10);

        CustomerWarehouse customerWarehouse = new CustomerWarehouse(warehouse1, 150);
        ParkingSpace parkingSpace = new ParkingSpace(warehouse1, 60);
        ServiceWarehouse serviceWarehouse = new ServiceWarehouse(warehouse1);

        System.out.println("customerWarehouse area: " + customerWarehouse.getWarehouseArea());
        System.out.println("parking area: " + parkingSpace.getParkingArea());
        System.out.println("serviceWarehouse area: " + serviceWarehouse.getServiceWarehouseArea());


        Person person = new Person();


        System.out.println(customerWarehouse.getWarehouseArea());
        person.reserveCustomerWarehouseArea(customerWarehouse, 10);
        person.reserveParkingSpace(parkingSpace, 10);

        Person person2 = new Person();

        person2.reserveCustomerWarehouseArea(customerWarehouse, 10);


        Person person3 = new Person();

        person3.reserveCustomerWarehouseArea(customerWarehouse, 10);

    }
}
