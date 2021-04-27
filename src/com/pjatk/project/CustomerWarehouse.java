package com.pjatk.project;

import java.util.Objects;

public class CustomerWarehouse extends Warehouse {

    private int id;
    private static int count;
    private double warehouseArea;

    public CustomerWarehouse(Warehouse warehouse, double warehouseArea) {
        super(warehouse.getPercentageServiceArea(), warehouse.getArea());
        if (warehouseArea <= warehouse.getAvailableArea())
            this.warehouseArea = warehouseArea;
        else {
            System.out.println("Sorry, but there is no available space to create this warehouse");
            this.warehouseArea = warehouse.getAvailableArea();
        }
        if (warehouse.getArea() > 0 && warehouse.getAvailableArea() >= warehouseArea) {
            warehouse.setAvailableArea(warehouse.getAvailableArea() - warehouseArea);
        } else {
            warehouseArea = 0;
        }
        super.setAvailableArea(warehouse.getAvailableArea() - warehouseArea);
        count++;
        id = count;
    }

    public void reserveWarehouseArea(double area) {
        if (area > 0) {
            this.setWarehouseArea(warehouseArea - area);
        } else {
            System.out.println("Wrong value, type number grater than 0!");
        }
    }

    // -------- getters & setters ---------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWarehouseArea() {
        return warehouseArea;
    }

    public void setWarehouseArea(double warehouseArea) {
        this.warehouseArea = warehouseArea;
    }

    // -------- equals & hascode ---------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerWarehouse that = (CustomerWarehouse) o;
        return id == that.id && Double.compare(that.warehouseArea, warehouseArea) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, warehouseArea);
    }
}