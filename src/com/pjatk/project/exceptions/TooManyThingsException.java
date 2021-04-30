package com.pjatk.project.exceptions;

public class TooManyThingsException extends Exception {

    private final String command;

    public TooManyThingsException() {
        command = "Remove some old items to insert a new item";
        System.out.println(command);
    }
}
