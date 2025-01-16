public class Fibonacci {
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

