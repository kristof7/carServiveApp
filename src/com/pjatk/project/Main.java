package com.pjatk.project;

import com.pjatk.project.exceptions.TooManyThingsException;
import com.pjatk.project.vehicles.Motorcycle;
import com.pjatk.project.vehicles.Vehicle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {

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

        CustomerWarehouse customerWarehouse = new CustomerWarehouse(warehouse1, 280);
        CustomerWarehouse customerWarehouse2 = new CustomerWarehouse(warehouse1, 70);
        ParkingSpace parkingSpace = new ParkingSpace(warehouse1, 30);
        ParkingSpace parkingSpace2 = new ParkingSpace(warehouse1, 30);
        ServiceWarehouse serviceWarehouse = new ServiceWarehouse(warehouse1);

        System.out.println("customerWarehouse area: " + customerWarehouse.getWarehouseArea());
        System.out.println("customerWarehouse id: " + customerWarehouse.getId());

        System.out.println("parking area: " + parkingSpace.getParkingArea());
        System.out.println("serviceWarehouse area: " + serviceWarehouse.getServiceWarehouseArea());

        Date date = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//        System.out.println(formatter.format(date));


        Person tenant = new Person("Steve", "Norman", "123456339", "12-05-1997");


        System.out.println(customerWarehouse.getWarehouseArea());

        tenant.reserveCustomerWarehouseArea(customerWarehouse, 10);
        tenant.reserveCustomerWarehouseArea(customerWarehouse, 20);
        tenant.reserveCustomerWarehouseArea(customerWarehouse, 10);
        tenant.reserveCustomerWarehouseArea(customerWarehouse, 80);
        ParkingSpace ps = tenant.reserveParkingSpace(parkingSpace, 10);
        System.out.println("parking area: "+ps.getParkingArea());

        Vehicle motorcycle = new Motorcycle(3, 900, "enginetype1", "Motorcycle", "Suzuki");
        try {
            ps.addVechicleToParkingSpace(motorcycle, ps);
            System.out.println("parking area: "+ps.getParkingArea());
            System.out.println(ps.getAvailableParkingArea());
            System.out.println("vechicles: "+ps.getVechicles());
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


        System.out.println("customer warehouse with id "+ customerWarehouse.getId() +" have persons with permission: " + customerWarehouse.getPersonsWithPermission());

    }
}
