package org.example;

public class Stack02 {
    private Integer[] arr;
    private int pointer = -1;

    public Stack02() {
        this.arr = new Integer[1000];
    }

    public Stack02(int size) {
        this.arr = new Integer[size];
    }

    public void push(int value) {
        this.arr[++this.pointer] = value;
    }

    public int pop() {
        return this.arr[this.pointer--];
    }
    public Integer[] getArr(){
        return arr;
    }
}
