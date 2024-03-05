import java.util.Stack;

public class Homework_1_1 {    
    public static void main(String[] args) {
       // Your main() is not graded so you can
       // have any implementation in this area, e.g.,
       MaxStack obj = new MaxStack();
       obj.push(12);
       obj.push(1);
       obj.push(-12);
       obj.pop();
       System.out.println(obj.top());
       System.out.println(obj.getMax());
       // etc. 
   }
}
/**
* The MaxStack program implements a Stack class with the following features:
* push(x) -- push integer element x onto stack. This method returns void.
* pop() -- remove the element on top of the stack. This method returns void.
* top() -- get the top integer element.
* getMax() -- retrieve the integer max element in the stack in constant time O(1)
*/

class MaxStack {

    int max = Integer.MIN_VALUE;
    Stack<Integer> stack = new Stack<Integer>();

    public MaxStack() {
        if (!stack.empty())
            stack.clear();
    }

    public void push(int x) {
        if (x > max) {
            stack.push(max);
            max = x;
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.pop() == max)
            max = stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMax() {
        return max;
    }
}