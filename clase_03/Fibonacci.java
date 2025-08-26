class Fibonacci {

    // O(2 ^ N)
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // N = 7 | 1625 ns
    // N = 30 | 2463500 ns
    public static void main(String[] args) {
        int N = 30;
        long startTime = System.nanoTime();
        int fibResult = fibonacci(N);
        long endTime = System.nanoTime();
        System.out.printf(
            "Fibonacci Exponencial para N = %d se demoró %d nano segundos y retornó",
            N,
            endTime - startTime,
            fibResult
        );
    }
}
