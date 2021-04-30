package com.pjatk.project;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class ServiceWarehouse extends Warehouse {

    private int id;
    private static int count;
    private double serviceWarehouseArea;
    private String serviceWarehouseRentDate;

    public ServiceWarehouse(Warehouse warehouse) {
        super(warehouse.getPercentageServiceArea(), warehouse.getArea());
        this.serviceWarehouseRentDate = printActualDate();
        if (warehouse.getArea() > 0) {
        this.serviceWarehouseArea = (warehouse.getArea() * warehouse.getPercentageServiceArea() / 100);
            warehouse.setAvailableArea(warehouse.getAvailableArea() - serviceWarehouseArea);
        } else {
            serviceWarehouseArea = 0;
        }
        count++;
        id = count;
    }


    public String printActualDate() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
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

    public double getServiceWarehouseArea() {
        return serviceWarehouseArea;
    }

    public void setServiceWarehouseArea(double serviceWarehouseArea) {
        this.serviceWarehouseArea = serviceWarehouseArea;
    }

    // -------- equals & hascode ---------


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceWarehouse that = (ServiceWarehouse) o;
        return id == that.id && Double.compare(that.serviceWarehouseArea, serviceWarehouseArea) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serviceWarehouseArea);
    }
}
