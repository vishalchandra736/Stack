package com.blz.stack;

public class MainStackUsingLL {
    public static void main(String[] args) {
        StackUsingLL stackUsingLL = new StackUsingLL();
        System.out.println(stackUsingLL.isEmpty());
        stackUsingLL.push(5);
        stackUsingLL.push(3);
        stackUsingLL.push(7);
        stackUsingLL.push(6);
        stackUsingLL.push(11);
        while (!stackUsingLL.isEmpty()) {
            System.out.println(stackUsingLL.peek());
            stackUsingLL.pop();
        }
    }
}
