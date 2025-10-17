class DivideArray {

    static void divideArray(int[] A, int lo, int hi) {
        if (lo > hi) return;
        int mid = (lo + hi) / 2;
        System.out.println(A[mid]);
        divideArray(A, lo, mid - 1);
        divideArray(A, mid + 1, hi);
        return;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8 };
        divideArray(A, 0, A.length - 1);
    }
}
