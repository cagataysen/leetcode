package min_stack;

import java.util.Stack;

class MinStack {

    Stack<Integer> stackObject;
    int min;

    public MinStack() {
        stackObject = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if(val <= min){
            stackObject.push(min); //WE PUSH PREVIOUS MIN FIRST FOR OUR LOGIC
            min = val;
        }
        stackObject.push(val);
    }

    public void pop() {
        if(stackObject.pop().equals(min)){
            min = stackObject.pop(); //PREVIOUS MIN IS THE NEW MIN
        }
    }

    public int top() {
        return stackObject.peek();
    }

    public int getMin() {
            return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
