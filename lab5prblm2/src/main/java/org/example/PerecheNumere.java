package org.example;

public class PerecheNumere {
    private int numar1;
    private int numar2;

    public PerecheNumere() {
        this.numar1 = 0;
        this.numar2 = 0;
    }

    public PerecheNumere(int numar1, int numar2) {
        this.numar1 = numar1;
        this.numar2 = numar2;
    }

    public int getNumar1() {
        return numar1;
    }

    public void setNumar1(int numar1) {
        this.numar1 = numar1;
    }

    public int getNumar2() {
        return numar2;
    }

    public void setNumar2(int numar2) {
        this.numar2 = numar2;
    }

    @Override
    public String toString() {
        return "PerecheNumere{" + "numar1=" + numar1 + ", numar2=" + numar2 + '}';
    }

    public boolean suntConsecutiveFibonacci() {
        int a = 0, b = 1;
        while (b < numar1) {
            int temp = a;
            a = b;
            b = a + temp;
        }
        return b == numar1 && b + a == numar2;
    }

    public int cmmdc() {
        int a = numar1;
        int b = numar2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public boolean sumaCifrelorEgala() {
        return sumaCifrelor(numar1) == sumaCifrelor(numar2);
    }

    private int sumaCifrelor(int numar) {
        int suma = 0;
        while (numar > 0) {
            suma += numar % 10;
            numar /= 10;
        }
        return suma;
    }
}
