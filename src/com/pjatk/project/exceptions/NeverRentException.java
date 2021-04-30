package com.pjatk.project.exceptions;

public class NeverRentException {

    private final String command;

    public NeverRentException() {
        command = "Error: You tried to recive date from warehouse that wasn't rent";
        System.out.println(command);
    }
}
