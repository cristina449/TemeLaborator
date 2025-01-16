import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numere = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("in.txt"))) {
            while (scanner.hasNextInt()) {
                numere.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fișierul 'in.txt' nu a fost găsit!");
            return;
        }

        double suma = Util.calculeazaSuma(numere);
        double media = Util.calculeazaMedia(numere);
        int minim = Util.calculeazaMinim(numere);
        int maxim = Util.calculeazaMaxim(numere);

        System.out.println("Suma numerelor: " + suma);
        System.out.println("Media aritmetică: " + media);
        System.out.println("Valoarea minimă: " + minim);
        System.out.println("Valoarea maximă: " + maxim);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"))) {
            writer.write("Suma numerelor: " + suma + "\n");
            writer.write("Media aritmetică: " + media + "\n");
            writer.write("Valoarea minimă: " + minim + "\n");
            writer.write("Valoarea maximă: " + maxim + "\n");
        } catch (IOException e) {
            System.out.println("A apărut o eroare la scrierea fișierului 'out.txt'!");
        }
    }
}
