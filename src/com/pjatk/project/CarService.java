package com.pjatk.project;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private double carServiceArea;
    private double carServiceAvailableArea;
    ArrayList<Warehouse> warehouseList = new ArrayList<>();

    public CarService(double carServiceArea) {
        this.carServiceArea = carServiceArea;
        this.carServiceAvailableArea = carServiceArea;
    }

    public void addWarehouse(Warehouse warehouse) {
        if (this.carServiceAvailableArea > warehouse.getArea()) {
            setCarServiceAvailableArea(carServiceAvailableArea -= warehouse.getArea());
            warehouseList.add(warehouse);
        } else {
            System.out.println("Sorry,but there is no available space for this warehouse");
        }
    }


    public double getCarServiceArea() {
        return carServiceArea;
    }

    public void setCarServiceArea(double carServiceArea) {
        this.carServiceArea = carServiceArea;
    }

    public double getCarServiceAvailableArea() {
        return carServiceAvailableArea;
    }

    public void setCarServiceAvailableArea(double carServiceAvailableArea) {
        this.carServiceAvailableArea = carServiceAvailableArea;
    }

    public List<Warehouse> getWarehouseList() {
        return warehouseList;
    }

    public void setWarehouseList(ArrayList<Warehouse> warehouseList) {
        this.warehouseList = warehouseList;
    }
}
