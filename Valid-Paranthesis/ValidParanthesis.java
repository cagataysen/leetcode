import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for(char c: s.toCharArray()){
            if(c == '('){
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            }else if (c == '[') {
                stack.push(']');
            }

            char top = stack.peek();

            /*get the top of the stack and check if it's the matching opening bracket*/
            if((c == '(' && top == ')') || (c == '[' && top == ']') || (c == '{' && top == '}')){
                stack.pop();
            }
            else{
                /* the brackets don't match, so return false */
                return false;
            }

        }
/* If the stack is empty, all opening brackets have been closed, so return true
        // Otherwise, there are unmatched opening brackets, so return false */
        return stack.isEmpty();

    }
}
