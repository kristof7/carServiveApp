package com.pjatk.project;

import com.pjatk.project.vehicles.Vehicle;

import java.io.*;
import java.util.Scanner;

public class FileInputOutput {

    private File file;
    private Scanner fileRead;
    private PrintWriter fileWrite;

    public FileInputOutput() throws IOException {
        file = new File("warehouse.txt");
        if(!file.exists())
            file.createNewFile();
        fileRead = new Scanner(new File("warehouse.txt"));
        fileWrite = new PrintWriter("warehouse.txt");
    }

    public void vehicleRead(Vehicle vechicle) {
        String text = fileRead.nextLine();
        vechicle.setWeight(Double.parseDouble(text));
    }

    public void parkingSpaceWrite(ParkingSpace parkingSpace)
    {
        fileWrite.println(parkingSpace.getId());
        fileWrite.println(parkingSpace.getParkingArea());
        fileWrite.println(parkingSpace.getAvailableParkingArea());
    }

    public void terminateWrite()
    {
        fileWrite.close();
    }


}
