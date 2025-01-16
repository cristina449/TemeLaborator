import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți lungimea dreptunghiului: ");
        double lungime = scanner.nextDouble();

        System.out.print("Introduceți lățimea dreptunghiului: ");
        double latime = scanner.nextDouble();

        Dreptunghi dreptunghi = new Dreptunghi(lungime, latime);

        double perimetru = dreptunghi.calculeazaPerimetru();
        double arie = dreptunghi.calculeazaArie();

        System.out.println("Perimetrul dreptunghiului este: " + perimetru);
        System.out.println("Aria dreptunghiului este: " + arie);
        scanner.close();
    }
}
