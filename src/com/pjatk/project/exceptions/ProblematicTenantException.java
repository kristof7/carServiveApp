package com.pjatk.project.exceptions;

import com.pjatk.project.Person;

public class ProblematicTenantException extends Exception {

    private final String command;

    public ProblematicTenantException(Person person) {
        command = "Osoba" + person.getName() + "posiadała już najem pomieszczeń: lista_pomieszczeń - wysokość_zadłużenia";
        System.out.println(command);
    }

}
