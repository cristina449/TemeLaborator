import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        String[] judete = citesteJudeteDinFisier("resources/judete_in.txt");
        if (judete == null || judete.length == 0) {
            System.out.println("Fișierul este gol sau nu a putut fi citit.");
            return;
        }

        Arrays.sort(judete);

        System.out.println("Județele ordonate sunt:");
        for (String județ : judete) {
            System.out.println(județ);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti județul pe care doriți să-l căutați: ");
        String judetCautat = scanner.nextLine();

        int pozitie = Arrays.binarySearch(judete, judetCautat);

        if (pozitie >= 0) {
            System.out.println("Județul " + judetCautat + " se află pe poziția " + pozitie + " în vectorul ordonat.");
        } else {
            System.out.println("Județul " + judetCautat + " nu a fost găsit.");
        }

        scanner.close();
    }

    public static String[] citesteJudeteDinFisier(String fisier) {
        try (BufferedReader br = new BufferedReader(new FileReader(fisier))) {
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            String[] judete = sb.toString().split("\n");
            return judete;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}