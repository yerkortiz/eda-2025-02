import java.util.Arrays;

class BinSearch {

    static boolean isPresent(int[] A, int key) {
        int lo = 0;
        int hi = A.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (A[mid] == key) return true;
            else if (A[mid] > key) hi = mid - 1;
            else lo = mid + 1;
        }
        return false;
    }

    static boolean isPresentLinear(int[] A, int key) {
        for (int e : A) {
            if (e == key) return true;
        }
        return false;
    }

    static int[] randomArray(int N) {
        int[] A = new int[N];
        for (int i = 0; i < N; ++i) {
            A[i] = (int) (Math.random() * 1000);
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = randomArray(100000000);
        Arrays.sort(A);

        System.out.println("Busqueda binaria");
        long startTime = System.nanoTime();
        isPresent(A, 10000);
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        System.out.println("Busqueda lineal");
        startTime = System.nanoTime();
        isPresentLinear(A, 10000);
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }
}
