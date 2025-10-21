import java.util.PriorityQueue;

class ExPq {

    public static void main(String[] args) {
        // min pq
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.offer(6);
        pq.offer(8);
        pq.offer(2);
        System.out.printf("%d\n", pq.poll());
        System.out.printf("%d\n", pq.peek());
        System.out.printf("%d\n", pq.peek());
    }
}
