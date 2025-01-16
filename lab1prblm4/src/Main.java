import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numar1 = random.nextInt(30) + 1;  // număr între 1 și 30
        int numar2 = random.nextInt(30) + 1;  // număr între 1 și 30

        System.out.println("Numarul 1: " + numar1);
        System.out.println("Numarul 2: " + numar2);

        int cmmdc = CMMDC.calculeazaCMMDC(numar1, numar2);

        System.out.println("CMMDC-ul dintre " + numar1 + " si " + numar2 + " este: " + cmmdc);
    }
}
