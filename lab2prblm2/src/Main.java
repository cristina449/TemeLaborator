import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String inputFile = Main.class.getResource("/cantec_in.txt").getPath();
        String outputFile = "resources/cantec_out.txt";

        List<Vers> versuri = citesteVersuriDinFisier(inputFile);
        scrieInFisier(outputFile, versuri, "a");
    }
    public static List<Vers> citesteVersuriDinFisier(String fisier) {
        List<Vers> versuri = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fisier))) {
            String linie;
            while ((linie = reader.readLine()) != null) {
                versuri.add(new Vers(linie));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return versuri;
    }
    public static void scrieInFisier(String fisier, List<Vers> versuri, String grupare) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fisier))) {
            for (Vers vers : versuri) {
                String versFormatat = vers.obtineVersFormatat(grupare);
                writer.write(versFormatat);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
