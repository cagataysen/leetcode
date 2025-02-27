package baseball_game;

import java.util.Stack;

public class CalPoints {
    public int calPoints(String[] operations) {

        int total = 0;
        Stack<Integer> operationStack = new Stack<>();

        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals(String.valueOf('+'))){
                operationStack.push(operationStack.getLast() + operationStack.get(operationStack.size() - 2));
            } else if (operations[i].equals(String.valueOf('D'))) {
                operationStack.push(operationStack.getLast() * 2);
            }
            else if (operations[i].equals(String.valueOf('C'))) {
                operationStack.pop();
            }
            else{
                operationStack.push(Integer.parseInt(operations[i]));
            }

        }

        if(operationStack.size() == 0){
            return 0;
        }
        for(int i: operationStack){
            total = total + i;
        }

        return total;
    }
}
