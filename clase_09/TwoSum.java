import java.util.Arrays;
import java.util.HashSet;

class TwoSum {

    // O(N ^ 2)
    static void twosum1(int[] A, int s) {
        for (int i = 0; i < A.length; ++i) {
            for (int j = i; j < A.length; ++j) {
                if (A[i] + A[j] == s) {
                    System.out.printf("%d %d\n", A[i], A[j]);
                    return;
                }
            }
        }
        System.out.println("NO SOLUTION");
    }

    // O(N lg N)
    static void twosum2(int[] A, int s) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; ++i) {
            int p = Arrays.binarySearch(A, s - A[i]);
            if (p > 0) {
                System.out.printf("%d %d\n", A[i], A[p]);
                return;
            }
        }
        System.out.println("NO SOLUTION");
    }

    // O(N)
    static void twosum3(int[] A, int s) {
        HashSet<Integer> h = new HashSet<Integer>();
        for (int a : A) {
            h.add(a);
        }

        for (int i = 0; i < A.length; ++i) {
            if (h.contains(s - A[i])) {
                System.out.printf("%d %d\n", A[i], s - A[i]);
                return;
            }
        }
        System.out.println("NO SOLUTION");
    }

    public static void main(String[] args) {
        int[] A = { 5, 4, 2, 1 };
        int s = 3;
        int s2 = 100;
        twosum3(A, s);
        twosum3(A, s2);
    }
}
