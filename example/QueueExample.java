import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<Integer>();
        q.offer(5);
        System.out.println(q.poll());
    }
}
