class Collatz {

    static void collatz(long N) {
        System.out.println(N);
        if (N == 1) {
            return;
        }
        if (N % 2 == 0) collatz(N / 2);
        else collatz(3 * N + 1);
    }

    static long collatzLength(long N) {
        if (N == 1) {
            return N;
        }
        if (N % 2 == 0) return collatzLength(N / 2) + 1;
        else return collatzLength(3 * N + 1) + 1;
    }

    static final int MAX_N = 1_000_000;

    static void collatzLengthMemoi(int N, int[] memoi) {
        if (memoi[N] != 0) {
            return;
        }
        if (N % 2 == 0) {
            collatzLengthMemoi(N / 2, memoi);
            memoi[N] = memoi[N / 2] + 1;
        } else {
            collatzLengthMemoi(3 * N + 1, memoi);
            memoi[N] = memoi[3 * N + 1] + 1;
        }
    }

    static void collatzMaxSequence(int i, int j) {
        int[] memoiTable = new int[MAX_N];
        memoiTable[1] = 1;
        int maxSequence = i;
        for (int k = i; k <= j; ++k) {
            collatzLengthMemoi(k, memoiTable);
            if (memoiTable[k] > memoiTable[maxSequence]) {
                maxSequence = k;
            }
        }
        System.out.printf("%d %d", maxSequence, memoiTable[maxSequence]);
    }

    public static void main(String[] args) {
        collatzMaxSequence(1, 1500);
    }
}
