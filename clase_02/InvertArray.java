class InvertArray {

    static void invertArray(int[] A) {
        int lo = 0;
        int hi = A.length - 1;
        while (lo < hi) {
            int temp = A[lo];
            A[lo] = A[hi];
            A[hi] = temp;
            lo++;
            hi--;
        }
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < A.length; ++i) System.out.printf("%d ", A[i]);
        System.out.println();
        invertArray(A);
        for (int i = 0; i < A.length; ++i) System.out.printf("%d ", A[i]);
        System.out.println();
    }
}
