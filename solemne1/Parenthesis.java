import java.util.Deque;
import java.util.LinkedList;

class Parenthesis {

    static boolean validParenthesis(String expr) {
        Deque<Character> st = new LinkedList<Character>();
        for (Character c : expr.toCharArray()) {
            switch (c) {
                case '{', '[', '(':
                    st.push(c);
                    break;
                case '}':
                    if (st.isEmpty() || st.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (st.isEmpty() || st.pop() != '[') {
                        return false;
                    }
                    break;
                case ')':
                    if (st.isEmpty() || st.pop() != '(') {
                        return false;
                    }
                    break;
                default:
                    continue;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String expr1 = "[](){}";
        System.out.printf("%s, %b\n", expr1, validParenthesis(expr1));

        String expr2 = "[[](){}";
        System.out.printf("%s, %b\n", expr1, validParenthesis(expr2));

        String expr3 = "{ } ( [ { } [ ] ( { [ ] } ) ] ) ";
        System.out.printf("%s, %b\n", expr1, validParenthesis(expr3));
    }
}
