import java.util.Stack;

public class HW1_2 {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(12);
        obj.push(1);
        obj.push(-12);
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }
}

// REPLACE "TO BE FILLED" WITH YOUR API, WHICH FOLLOWS THE
// PURPOSE/PARAMETERS/RETURN VALUES STYLE PER THE SYLLABUS.
// YOU MAY ALSO FOLLOW THE API FOR PROBLEM #1 ABOVE.
/**
 * push(x) -- push integer element x onto stack. This method returns void.
 * pop() -- remove the element on top of the stack. This method returns void.
 * top() -- get the top integer element.
 * getMin() -- retrieve the integer min element in the stack in constant time
 * O(1)
 */

class MinStack {

    // Initialize your data structure here
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();

    public MinStack() {
        if (!stack.empty()) {
            stack.clear();
        }
    }

    public void push(int x) {
        if (x < min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.pop() == min) {
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}