class ArrayOperations {

    //O(N)
    static int[] createArray(int N) {
        return new int[N];
    }

    //O(1)
    static int getAt(int[] A, int i) {
        if (i >= A.length || i < 0) return 0;
        return A[i];
    }

    //O(1)
    static void setAt(int[] A, int i, int v) {
        if (i >= A.length || i < 0) return;
        A[i] = v;
    }

    //O(N)
    static void iterate(int[] A) {
        for (int i = 0; i < A.length; ++i) {
            System.out.printf("%d ", A[i]);
        }
        System.out.println();
    }

    //O(N)
    static void fill(int[] A, int v) {
        for (int i = 0; i < A.length; ++i) {
            A[i] = v;
        }
    }

    //O(N)
    static boolean search(int[] A, int key) {
        for (int i = 0; i < A.length; ++i) {
            if (A[i] == key) return true;
        }
        return false;
    }

    //O(N)
    static void copy(int[] A, int[] B) {
        if (A.length != B.length) return;
        for (int i = 0; i < A.length; ++i) {
            B[i] = A[i];
        }
    }

    //O(N)
    static int[] insertAtEnd(int[] A, int key) {
        int[] B = new int[A.length + 1];
        for (int i = 0; i < A.length; ++i) {
            B[i] = A[i];
        }
        B[B.length - 1] = key;
        return B;
    }

    //O(N)
    static int[] deleteAt(int[] A, int p) {
        if (p < 0 || p >= A.length) return A;
        int[] B = new int[A.length - 1];
        for (int i = 0; i < p; ++i) {
            B[i] = A[i];
        }
        for (int i = p + 1; i < A.length; ++i) {
            B[i - 1] = A[i];
        }
        return B;
    }

    //O(N)
    static int[] increaseCapacity(int[] A) {
        int[] B = new int[2 * A.length];
        System.arraycopy(A, 0, B, 0, A.length);
        return B;
    }

    public static void main(String[] args) {
        // int[] A = createArray(4);
        // System.out.println(getAt(A, 0));
        // setAt(A, 0, 1);
        // System.out.println(getAt(A, 0));

        int N = 10;
        int[] A = new int[N];
        System.out.println(A[0]);
        A[0] = 7;
        System.out.println(A[0]);
        System.out.println(A.length);
        A = increaseCapacity(A);
        System.out.println(A.length);
    }
}
