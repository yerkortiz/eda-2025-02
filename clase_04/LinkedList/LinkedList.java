class LinkedList {

    static class Node {

        int val;
        Node next;

        Node(int v) {
            this.val = v;
        }
    }

    Node head;

    void insertFirst(int v) {
        Node aux = new Node(v);
        aux.next = this.head;
        this.head = aux;
    }

    void insertLast(int v) {
        Node temp = new Node(v);
        if (this.head == null) {
            this.head = temp;
            return;
        }

        Node aux = this.head;
        while (aux.next != null) {
            aux = aux.next;
        }
        aux.next = temp;
    }

    void deleteLast() {
        if (this.head == null) {
            return;
        }

        if (this.head.next == null) {
            this.head = null;
            return;
        }

        Node aux = this.head;
        Node prev = null;
        while (aux.next != null) {
            prev = aux;
            aux = aux.next;
        }

        prev.next = null;
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
        LinkedList l = new LinkedList();
        l.insertFirst(5);
        l.insertFirst(4);
        l.insertFirst(3);
        l.iterate();
    }
}
