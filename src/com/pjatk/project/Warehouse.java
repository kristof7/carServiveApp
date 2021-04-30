package com.pjatk.project;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private double percentageServiceArea;
    private double availableArea;
    private double area;
    private ArrayList<Person> personsWithPermission = new ArrayList<>();
    private Person payer;

    public Warehouse(double percentageServiceArea, double area) {
        this.percentageServiceArea = percentageServiceArea;
        if (area > 0)
            this.availableArea = (area - (percentageServiceArea / 100) * area);
        else {
            availableArea = 0;
        }
        this.area = area;
        if (personsWithPermission.size() != 0) {
            this.payer = personsWithPermission.get(0);
        } else {
            this.payer = null;
        }
    }

    public Warehouse() {

    }

    public void addCustomerToWarehouse(Person person) {
        if (personsWithPermission.size() != 0)
            this.personsWithPermission.add(person);
    }

    public double getPercentageServiceArea() {
        return percentageServiceArea;
    }

    public void setPercentageServiceArea(double percentageServiceArea) {
        this.percentageServiceArea = percentageServiceArea;
    }

    public double getArea() {
        return area;
    }

    public double getAvailableArea() {
        return availableArea;
    }

    public void setAvailableArea(double availableArea) {
        this.availableArea = availableArea;
    }

    public List<Person> getPersonsWithPermission() {
        return personsWithPermission;
    }

    public void setPersonsWithPermission(ArrayList<Person> personsWithPermission) {
        this.personsWithPermission = personsWithPermission;
    }

    public Person getPayer() {
        return payer;
    }

    public void setPayer(Person payer) {
        this.payer = payer;
    }
}
