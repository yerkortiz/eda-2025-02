import java.util.Stack;

class Parenthesis {

    // O(N)
    static boolean validateExpr(String expr) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < expr.length(); ++i) {
            switch (expr.charAt(i)) {
                case '{':
                    st.push(expr.charAt(i));
                    break;
                case '(':
                    st.push(expr.charAt(i));
                    break;
                case '[':
                    st.push(expr.charAt(i));
                    break;
                case '}':
                    if (st.peek() != '{') return false;
                    st.pop();
                    break;
                case ')':
                    if (st.peek() != '(') return false;
                    st.pop();
                    break;
                case ']':
                    if (st.peek() != '[') return false;
                    st.pop();
                    break;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String testCase1 = "[({})]";
        System.out.println(validateExpr(testCase1));
    }
}
