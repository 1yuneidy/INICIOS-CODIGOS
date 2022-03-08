public class Factorial {
    public static void main (String[] argv) {
        System.out.println(f(5));
    }
    public static int f(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return f(n-1) * n;
        }
    }
}  