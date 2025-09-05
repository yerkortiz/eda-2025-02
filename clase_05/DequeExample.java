// import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

class DequeExample {

    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<Integer>();
        dq.offerFirst(5);
        dq.offerFirst(8);
        dq.offerLast(7);
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
    }
}
