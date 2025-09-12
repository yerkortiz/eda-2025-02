package clase_07;

class Stack implements StackIn {

    Node top;

    @Override
    public void push(int key) {
        Node temp = new Node();
        temp.val = key;
        temp.next = this.top;
        this.top = temp;
    }

    @Override
    public Node pop() {
        if (this.top == null) return null;
        Node aux = this.top;
        this.top = this.top.next;
        return aux;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(7);
        System.out.printf("%d\n", st.pop().val);
    }
}
