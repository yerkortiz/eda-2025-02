class FibonacciDP {

    static long fibonacci(int N) {
        long[] table = new long[N + 1];
        table[0] = 0;
        table[1] = 1;
        for (int i = 2; i <= N; ++i) {
            table[i] = table[i - 1] + table[i - 2];
        }
        return table[N];
    }

    public static void main(String[] Args) {
        int N = 100000;
        long startTime = System.nanoTime();
        long fibResult = fibonacci(N);
        long endTime = System.nanoTime();
        System.out.printf(
            "Fibonacci Exponencial para N = %d se demoró %d nano segundos y retornó %d",
            N,
            endTime - startTime,
            fibResult
        );
    }
}
