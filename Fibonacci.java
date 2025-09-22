public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;  // number of terms (direct input)
        int a = 0, b = 1;

        System.out.print("Fibonacci Series (" + n + " terms): ");
        for(int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
