class LinkedListTail {

    static class Node {

        int val;
        Node next;

        Node(int v) {
            this.val = v;
        }
    }

    Node head;
    Node tail;

    void insertLast(int v) {
        Node temp = new Node(v);

        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    void insertFirst(int v) {
        Node temp = new Node(v);

        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    void iterate() {
        Node aux = this.head;
        while (aux != null) {
            System.out.printf("%d ", aux.val);
            aux = aux.next;
        }
        System.out.printf("\n");
    }

    public static void main(String[] Args) {
        // LinkedListTail l = new LinkedListTail();
    }
}
