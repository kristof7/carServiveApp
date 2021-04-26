package com.pjatk.project;

import java.util.List;

public class Warehouse {

    private double percentageServiceArea;
    private double availableArea;
    private double area;
    private List<Person> persons;
    private Person payer;

    public Warehouse(double percentageServiceArea, double area) {
        this.percentageServiceArea = percentageServiceArea;
        if (area > 0)
            this.availableArea = (area - (percentageServiceArea / 100) * area);
        else {
            availableArea = 0;
        }
        this.area = area;
        if (persons != null) {
            this.payer = persons.get(0);
        } else {
            this.payer = null;
        }
    }

    public void addCustomerToWarehouse(Person person) {
        if (person != null)
            this.persons.add(person);
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

    public void setArea(double area) {
        this.area = area;
    }

    public double getAvailableArea() {
        return availableArea;
    }

    public void setAvailableArea(double availableArea) {
        this.availableArea = availableArea;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public Person getPayer() {
        return payer;
    }

    public void setPayer(Person payer) {
        this.payer = payer;
    }
}
