package com.pjatk.project;

import com.pjatk.project.exceptions.TooManyThingsException;
import com.pjatk.project.vehicles.Motorcycle;
import com.pjatk.project.vehicles.Vehicle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        CarService carService = new CarService(2000);
        Warehouse warehouse1 = new Warehouse(20, 700);
        Warehouse warehouse2 = new Warehouse(20, 250);
        Warehouse warehouse3 = new Warehouse(10, 200);
        Warehouse warehouse4 = new Warehouse(50, 350);
        Warehouse warehouse5 = new Warehouse(40, 170);
        carService.addWarehouse(warehouse1);
        carService.addWarehouse(warehouse2);
        carService.addWarehouse(warehouse3);
        carService.addWarehouse(warehouse4);
        carService.addWarehouse(warehouse5);

        CustomerWarehouse customerWarehouse = new CustomerWarehouse(warehouse1, 50);
        CustomerWarehouse customerWarehouse2 = new CustomerWarehouse(warehouse1, 60);
        CustomerWarehouse customerWarehouse3 = new CustomerWarehouse(warehouse1, 65);
        CustomerWarehouse customerWarehouse4 = new CustomerWarehouse(warehouse1, 50);
        CustomerWarehouse customerWarehouse5 = new CustomerWarehouse(warehouse1, 45);
        CustomerWarehouse customerWarehouse6 = new CustomerWarehouse(warehouse1, 50);
        CustomerWarehouse customerWarehouse7 = new CustomerWarehouse(warehouse1, 40);
        CustomerWarehouse customerWarehouse8 = new CustomerWarehouse(warehouse1, 60);
        CustomerWarehouse customerWarehouse9 = new CustomerWarehouse(warehouse1, 25);
        CustomerWarehouse customerWarehouse0 = new CustomerWarehouse(warehouse1, 30);
        ParkingSpace parkingSpace = new ParkingSpace(warehouse1, 30);
        ParkingSpace parkingSpace2 = new ParkingSpace(warehouse1, 30);
        ServiceWarehouse serviceWarehouse = new ServiceWarehouse(warehouse1);




//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Hello in car Service, what would you like to do?");
//        System.out.println("1. Reserve warehouse");
//        System.out.println("2. Reserve car space");
//
//        Integer choose = sc.nextInt();
//
//
//        switch (choose) {
//
//            case 1:
//
//
//                System.out.println("Choose warehouse spot:");
//                System.out.println("1. warehouse id: " + customerWarehouse.getId() + ", area: " + customerWarehouse.getWarehouseArea() + " available space: " + customerWarehouse.getAvailableArea());
//                System.out.println("2. warehouse id: " + customerWarehouse2.getId() + ", area: " + customerWarehouse2.getWarehouseArea() + " available space: " + customerWarehouse2.getAvailableArea());
//
//                break;
//
//
//        }

        System.out.println("customerWarehouse area: " + customerWarehouse.getWarehouseArea());
        System.out.println("customerWarehouse id: " + customerWarehouse.getId());

        System.out.println("parking area: " + parkingSpace.getParkingArea());
        System.out.println("serviceWarehouse area: " + serviceWarehouse.getServiceWarehouseArea());



        Person tenant = new Person("Steve", "Norman", "123456339", "12-05-1997");


        System.out.println(customerWarehouse.getWarehouseArea());

        tenant.reserveCustomerWarehouseArea(customerWarehouse, 10);
        tenant.reserveCustomerWarehouseArea(customerWarehouse, 20);
        tenant.reserveCustomerWarehouseArea(customerWarehouse, 10);
        tenant.reserveCustomerWarehouseArea(customerWarehouse, 80);
        ParkingSpace ps = tenant.reserveParkingSpace(parkingSpace, 10);
        System.out.println("parking area: " + ps.getParkingArea());

        Vehicle motorcycle = new Motorcycle(3, 900, "enginetype1", "Motorcycle", "Suzuki");
        try {
            ps.addVechicleToParkingSpace(motorcycle, ps);
            System.out.println("parking area: " + ps.getParkingArea());
            System.out.println(ps.getAvailableParkingArea());
            System.out.println("vechicles: " + ps.getVechicles());
        } catch (TooManyThingsException e) {
            e.printStackTrace();
        }
//        tenant.reserveParkingSpace(parkingSpace, 10);

        FileInputOutput fileInputOutput = new FileInputOutput();
        fileInputOutput.parkingSpaceWrite(ps);
        fileInputOutput.terminateWrite();
        System.out.println("parking area main: " + parkingSpace.getParkingArea());

        Person person2 = new Person("George", "Steveson", "123547789", "12-05-1992");

        tenant.givePermission(customerWarehouse, person2);

        person2.reserveCustomerWarehouseArea(customerWarehouse, 10);

        person2.insertItemToWarehouse(customerWarehouse);


        Person person3 = new Person("Nary", "Soleman", "127856789", "12-05-1991");

        person3.reserveCustomerWarehouseArea(customerWarehouse, 10);
        person3.insertItemToWarehouse(customerWarehouse);


        System.out.println("customer warehouse with id " + customerWarehouse.getId() + " have persons with permission: " + customerWarehouse.getPersonsWithPermission());

    }
}
