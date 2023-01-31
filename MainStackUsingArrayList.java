package com.blz.stack;

public class MainStackUsingArrayList {
    public static void main(String[] args) {
        StackUsingArrayList stackUsingArrayList = new StackUsingArrayList();
        stackUsingArrayList.push(5);
        stackUsingArrayList.push(3);
        stackUsingArrayList.push(7);
        stackUsingArrayList.push(6);
        stackUsingArrayList.push(11);
        while (!stackUsingArrayList.isEmpty()) {
            System.out.println(stackUsingArrayList.peek());
            stackUsingArrayList.pop();
        }
    }
}
