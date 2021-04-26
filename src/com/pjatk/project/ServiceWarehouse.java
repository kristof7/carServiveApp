//package com.pjatk.project;
//
//public class ServiceWarehouse extends Warehouse {
//
//    private int id;
//    private double serviceWarehouseArea;
//
//    public ServiceWarehouse(double percentageServiceArea, double area) {
//        super(percentageServiceArea, area);
//
//        if (area > 0){
//            this.serviceWarehouseArea = (percentageServiceArea / area) * 100 ;
//        } else {
//            this.serviceWarehouseArea = 0;
//        }
//    }
//
//
//
//}
//
//
//========================================
//
//    public void reserveServiceWarehouseArea(Warehouse warehouse, Person person, double area) {
//        if(warehouse.getAvailableArea() <= area){
//            warehouse.setAvailableArea(super.getAvailableArea() - area);
//            warehouse.addCustomerToWarehouse(person);
//        } else {
//            System.out.println("Sorry, but there is no available area to reserve");
//        }
//    }
