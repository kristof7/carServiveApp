package com.pjatk.project;

import java.util.Objects;

public class CustomerWarehouse extends Warehouse {

    private int id;
    private double warehouseArea;

    public CustomerWarehouse(Warehouse warehouse, double warehouseArea) {
        super(warehouse.getPercentageServiceArea(), warehouse.getArea());

        if (warehouse.getArea() > 0 && warehouse.getAvailableArea() >= warehouseArea) {
            this.warehouseArea = warehouseArea;
            warehouse.setAvailableArea(warehouse.getAvailableArea() - warehouseArea);
        } else {
            warehouseArea = 0;
        }
        super.setAvailableArea(warehouse.getAvailableArea() - warehouseArea);
    }

    public void reserveWarehouseArea(double area) {
        if (area > 0) {
            this.setWarehouseArea(warehouseArea - area);
        } else {
            System.out.println("Wrong value, type number grater than 0!");
        }
    }

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