package com.blz.stack;

public class StackUsingLL {

    private Node head;
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public boolean isEmpty() {
        return null == head;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        return;
    }

    public int pop() {
        if(isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return head.data;
    }
}
