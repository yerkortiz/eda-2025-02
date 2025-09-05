import java.util.LinkedList;
import java.util.Queue;

class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(5);
        q.offer(7);
        q.offer(9);
        System.out.println(q.poll());
    }
}
