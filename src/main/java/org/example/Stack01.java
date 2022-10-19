package org.example;

public class Stack01 {
    private int[] arr = new int[10000];
    private int pointer = -1;

    public Stack01() {
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        this.arr[++this.pointer] = value;
    }
    public int pop() {
        return this.arr[this.pointer--];
    }
    public int[] getArr(){
        return arr;
    }
}
