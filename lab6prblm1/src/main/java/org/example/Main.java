package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Angajat> angajati = new ArrayList<>();
        angajati.add(new Angajat("Ion Popescu", "Manager", LocalDate.of(2015, 5, 1), 4000.0f));
        angajati.add(new Angajat("Maria Ionescu", "Programator", LocalDate.of(2018, 8, 15), 3000.0f));
        angajati.add(new Angajat("Alexandru Georgescu", "Analist", LocalDate.of(2020, 3, 25), 3500.0f));
        System.out.println("Lista angajaților:");
        for (Angajat angajat : angajati) {
            System.out.println(angajat);
        }
    }
}
