import java.util.regex.*;

public class Vers {
    private String vers;
    public Vers(String vers) {
        this.vers = vers;
    }

    public int numarCuvinte() {
        String[] cuvinte = vers.split("\\s+");
        return cuvinte.length;
    }

    public int numarVocale() {
        int numarVocale = 0;
        String versLower = vers.toLowerCase();
        for (int i = 0; i < versLower.length(); i++) {
            char c = versLower.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                numarVocale++;
            }
        }
        return numarVocale;
    }

    public boolean seTerminaCu(String grupare) {
        return vers.endsWith(grupare);
    }

    public String versMajuscule(double numarGenerat) {
        if (numarGenerat < 0.1) {
            return vers.toUpperCase();
        }
        return vers;
    }

    public String obtineVersFormatat(String grupare) {
        double numarGenerat = Math.random();
        int cuvinte = numarCuvinte();
        int vocale = numarVocale();

        String rezultat = vers + " | Cuvinte: " + cuvinte + " | Vocale: " + vocale;
        if (seTerminaCu(grupare)) {
            rezultat += " *";
        }
        return new Vers(versMajuscule(numarGenerat)).vers;
    }

    public String getVers() {
        return vers;
    }
}

