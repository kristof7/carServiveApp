package com.pjatk.project;

import java.util.List;

public class CarService {

    private double carServiceArea;
    List<Warehouse> warehouseList;

    public CarService(double carServiceArea, List<Warehouse> warehouseList) {
        this.carServiceArea = carServiceArea;
        this.warehouseList = warehouseList;
    }

    public void addWarehouse(Warehouse warehouse) {
        if (warehouse.getArea() > 0 && carServiceArea > warehouse.getArea()) {
            carServiceArea -= warehouse.getArea();
            warehouseList.add(warehouse);
        } else {
            System.out.println("Sorry,but there is no available space for this warehouse");
        }
    }

}
