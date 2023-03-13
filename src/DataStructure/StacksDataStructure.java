package DataStructure;

import java.util.Stack;

public class StacksDataStructure {
    public static void main(String[] args) {

        //Stack is a LIFO --> LAST IN FIRST OUT
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());

    }
}
