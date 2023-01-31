package com.blz.stack;

import java.util.ArrayList;

public class StackUsingArrayList {
    private static ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.size() == 0;
    }
    public void push(Integer data) {
        list.add(data);
    }
    public Integer pop() {
        if(isEmpty()) {
            return -1;
        }
        Integer top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    public Integer peek() {
        if(isEmpty()) {
            return -1;
        }
        return list.get(list.size()-1);
    }
}
