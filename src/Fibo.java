public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo_recursive(20));
        System.out.println(fibo_non_recursive(20));
    }

    public static int fibo_recursive(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibo_recursive(n - 2) + fibo_recursive(n - 1);
    }

    public static int fibo_non_recursive(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int prev = 0, curr = 1;

        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }
}
