package com.pjatk.project;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class CustomerWarehouse extends Warehouse {

    private int id;
    private static int count;
    private double warehouseArea;
    private double availableCustomerWarehouseArea;
    private String customerWarehouseRentDate;

    public CustomerWarehouse(Warehouse warehouse, double warehouseArea) {
        super(warehouse.getPercentageServiceArea(), warehouse.getArea());
        this.customerWarehouseRentDate = printActualDate();
        if (warehouseArea <= warehouse.getAvailableArea()) {
            this.warehouseArea = warehouseArea;
            this.availableCustomerWarehouseArea = warehouseArea;
        } else {
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

    public CustomerWarehouse() {

    }

    public String printActualDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
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

    public double getAvailableCustomerWarehouseArea() {
        return availableCustomerWarehouseArea;
    }

    public void setAvailableCustomerWarehouseArea(double availableCustomerWarehouseArea) {
        this.availableCustomerWarehouseArea = availableCustomerWarehouseArea;
    }

    public String getCustomerWarehouseRentDate() {
        return customerWarehouseRentDate;
    }

    public void setCustomerWarehouseRentDate(String customerWarehouseRentDate) {
        this.customerWarehouseRentDate = customerWarehouseRentDate;
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