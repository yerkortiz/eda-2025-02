import java.util.Stack;

class StackExample {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(5);
        st.push(7);
        System.out.println(st.pop());
    }
}
