import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class Kth {

    // O(N lg N)
    static int kth1(int[] A, int k) {
        Arrays.sort(A);
        return A[k - 1];
    }

    // O(N lg N)
    static int kth2(int[] A, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int a : A) {
            pq.offer(a);
        }

        for (int i = 1; i < k; ++i) {
            pq.poll();
        }

        return pq.poll();
    }

    static int kth3(int[] A, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(
            Collections.reverseOrder()
        );
        for (int a : A) {
            pq.offer(a);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        int[] A = { 4, 5, 1, 3 };
        int k = 3;
        System.out.printf("%d\n", kth3(A, k));
    }
}
