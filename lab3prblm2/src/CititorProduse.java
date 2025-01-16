import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CititorProduse {
    public static List<Produs> citesteProduseDinFisier(String fisier) {
        List<Produs> produse = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fisier))) {
            String linie;
            while ((linie = reader.readLine()) != null) {
                String[] valori = linie.split(",");
                String denumire = valori[0].trim();
                double pret = Double.parseDouble(valori[1].trim());
                int cantitate = Integer.parseInt(valori[2].trim());
                LocalDate dataExpirarii = LocalDate.parse(valori[3].trim());
                produse.add(new Produs(denumire, pret, cantitate, dataExpirarii));
            }
        } catch (IOException e) {
            System.out.println("Eroare la citirea fișierului: " + e.getMessage());
        }
        return produse;
    }
}

