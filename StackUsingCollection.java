package com.blz.stack;

import java.util.Stack;
public class StackUsingCollection {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(22);
        stack.push(6);
        stack.push(78);
        stack.push(4);
        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
