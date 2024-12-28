package javaproject;

import java.util.Stack;

class StackOperations {
    private Stack<Integer> stack = new Stack<>();

    public void pushElement(int element) {
        stack.push(element);
        System.out.println(element + " pushed onto the stack.");
    }

    public void popElement() {
        if (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        } else {
            System.out.println("Stack is empty.");
        }
    }

    public void displayStack() {
        System.out.println("Stack contents: " + stack);
    }
}

public class Q5Test {
    public static void main(String[] args) {
        StackOperations operations = new StackOperations();
        operations.pushElement(10);
        operations.pushElement(20);
        operations.displayStack();
        operations.popElement();
        operations.displayStack();
    }
}