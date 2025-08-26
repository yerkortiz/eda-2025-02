class FibonacciMemoi {

    //O(N)
    public static int fibonacci(int N) {
        if (N <= 1) {
            return N;
        }
        int[] memoiTable = new int[N + 1];
        memoiTable[1] = 1;
        memoiTable[0] = 0;
        return fibonacciMemoi(N, memoiTable);
    }

    static int fibonacciMemoi(int N, int[] memoiTable) {
        if (N <= 1) {
            return N;
        }
        if (memoiTable[N] != 0) {
            return memoiTable[N];
        }
        memoiTable[N] =
            fibonacciMemoi(N - 1, memoiTable) +
            fibonacciMemoi(N - 2, memoiTable);

        return memoiTable[N];
    }

    public static void main(String[] args) {
        int N = 10000;
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
