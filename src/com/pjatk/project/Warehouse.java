package com.pjatk.project;

import java.util.List;

public class Warehouse {

    private int percentageServiceArea;
    public List<Person> persons;

    private Person payer;

    public Warehouse(int percentageServiceArea, List<Person> persons) {
        this.percentageServiceArea = percentageServiceArea;
        this.persons = persons;
        if (persons != null) {
            this.payer = persons.get(0);
        } else {
            this.payer = null;
        }
    }
}
