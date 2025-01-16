import java.util.List;

public class Util {
    public static double calculeazaSuma(List<Integer> numere) {
        double suma = 0;
        for (int numar : numere) {
            suma += numar;
        }
        return suma;
    }

    public static double calculeazaMedia(List<Integer> numere) {
        double suma = calculeazaSuma(numere);
        return suma / numere.size();
    }

    public static int calculeazaMinim(List<Integer> numere) {
        int minim = Integer.MAX_VALUE;
        for (int numar : numere) {
            if (numar < minim) {
                minim = numar;
            }
        }
        return minim;
    }

    public static int calculeazaMaxim(List<Integer> numere) {
        int maxim = Integer.MIN_VALUE;
        for (int numar : numere) {
            if (numar > maxim) {
                maxim = numar;
            }
        }
        return maxim;
    }
}

