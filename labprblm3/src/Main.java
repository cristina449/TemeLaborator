import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar natural: ");
        int n = scanner.nextInt();

        if (NrPrim.estePrim(n)) {
            System.out.println("Numarul " + n + " este prim.");
        } else {
            System.out.print("Divizorii lui " + n + " sunt: ");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
