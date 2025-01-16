package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PerecheNumere> listaPerechi = new ArrayList<>();
        listaPerechi.add(new PerecheNumere(5, 8));
        listaPerechi.add(new PerecheNumere(13, 21));
        listaPerechi.add(new PerecheNumere(2, 3));
        System.out.println("Lista de perechi de numere:");
        for (PerecheNumere pereche : listaPerechi) {
            System.out.println(pereche);
            System.out.println("Sunt consecutive în Fibonacci? " + pereche.suntConsecutiveFibonacci());
            System.out.println("Cel mai mic multiplu comun: " + pereche.cmmdc());
            System.out.println("Suma cifrelor este egală? " + pereche.sumaCifrelorEgala());
        }
        scriere(listaPerechi);
        List<PerecheNumere> perechiCitite = citire();
        System.out.println("Perechi citite din fișier:");
        for (PerecheNumere pereche : perechiCitite) {
            System.out.println(pereche);
        }
    }

    public static void scriere(List<PerecheNumere> lista) { }

    public static List<PerecheNumere> citire() {
        return new ArrayList<>();
    }
}
