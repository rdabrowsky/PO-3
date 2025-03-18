public class Power {
    public static void main(String[] args) {
        long startTime, endTime;

        startTime = System.nanoTime();
        int non_recursive = pow_non_recursive(2, 35);
        endTime = System.nanoTime();
        long nonRecursiveTime = endTime - startTime;

        startTime = System.nanoTime();
        int recursive = pow_recursive(2, 35);
        endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;

        System.out.println("Non-recursive result: " + non_recursive);
        System.out.println("Recursive result: " + recursive);
        System.out.println("Non-recursive time: " + nonRecursiveTime + " ns");
        System.out.println("Recursive time: " + recursiveTime + " ns");
    }

    public static int pow_non_recursive(int x, int n) {
        if (n == 0) return 1;

        int temp = 1;

        for (int i = 0; i < n; i++) {
            temp *= x;

        }

        return temp;
    }

    public static int pow_recursive(int x, int n) {
        if (n == 0) return 1;
        if (n % 2 != 0) return x * pow_recursive(x, n - 1);

        int temp = pow_recursive(x, n / 2);

        return temp * temp;
    }
}
