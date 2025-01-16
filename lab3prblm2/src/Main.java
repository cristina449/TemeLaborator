import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produs> produse = CititorProduse.citesteProduseDinFisier("resources/produse.csv");

        System.out.println("Produse citite din fisier:");
        for (Produs produs : produse) {
            System.out.println(produs);
        }

        System.out.println("\nProduse (format personalizat):");
        for (Produs produs : produse) {
            System.out.println(produs.formatProdus("custom_format"));
        }

        System.out.println("\nProduse expirate:");
        for (Produs produs : produse) {
            if (produs.getDataExpirarii().isBefore(java.time.LocalDate.now())) {
                System.out.println(produs);
            }
        }

        System.out.println("\nProduse cu prețul minim:");
        double pretMinim = produse.stream().mapToDouble(Produs::getPret).min().orElse(0);
        for (Produs produs : produse) {
            if (produs.getPret() == pretMinim) {
                System.out.println(produs);
            }
        }
    }
}
