package org.example.stack;

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
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return this.arr[this.pointer--];
    }
    public Integer[] getArr(){
        return arr;
    }

    public boolean isEmpty() {
        if (this.pointer == -1){
            return true;
        } else{
            return false;
        }
    }

    public int peek() {
        return this.arr[this.pointer];
    }
}
