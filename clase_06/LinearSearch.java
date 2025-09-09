class LinearSearch {

    static class Node {

        int value;
        Node next;
    }

    boolean isPresent(Node head, int key) {
        Node aux = head;
        while (aux != null) {
            if (aux.value == key) return true;
            aux = aux.next;
        }
        return false;
    }

    boolean isPresent(int[] A, int key) {
        for (int e : A) {
            if (e == key) return true;
        }
        return false;
    }

    public static void main(String[] args) {}
}
