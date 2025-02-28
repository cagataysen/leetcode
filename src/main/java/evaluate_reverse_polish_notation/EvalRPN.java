package evaluate_reverse_polish_notation;

import java.util.Collections;
import java.util.Stack;

public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<String> tokenStack = new Stack<>();

        for (String token: tokens) {
            if(isOperator(token)){
                int num2 = Integer.parseInt(tokenStack.pop());
                int num1 = Integer.parseInt(tokenStack.pop());
                int result = 0;

                if(token.equals("+")){
                    result = num1 + num2;
                } else if (token.equals("-")) {
                    result = num1 - num2;
                }else if (token.equals("*")) {
                    result = num1 * num2;
                }else if (token.equals("/")) {
                    result = num1 / num2;
                }
                tokenStack.push(Integer.toString(result));

            }
            else{
                tokenStack.push(token);
            }
        }

        return Integer.parseInt(tokenStack.peek());
    }


    private boolean isOperator(String str){
        if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
            return true;
        }
        else{
            return false;
        }
    }
}
