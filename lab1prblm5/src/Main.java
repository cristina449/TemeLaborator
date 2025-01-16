import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numar = random.nextInt(21);  // număr între 0 și 20
        System.out.println("Numărul generat aleatoriu este: " + numar);

        if (esteInFibonacci(numar)) {
            System.out.println(numar + " face parte din șirul Fibonacci.");
        } else {
            System.out.println(numar + " NU face parte din șirul Fibonacci.");
        }
    }
    public static boolean esteInFibonacci(int numar) {
        int a = 0;
        int b = 1;
        while (a <= numar) {
            if (a == numar) {
                return true;
            }
            int urmatorul = a + b;
            a = b;
            b = urmatorul;
        }
        return false;
    }
}
