package org.example.java_1021;

import org.example.java_1021.Stack02;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {
    @BeforeEach
    void setUp(){
        System.out.println("before each");
    }

    @Test
    @DisplayName("push ok?")
    void push(){
        Stack02 stack02 = new Stack02();
        stack02.push(10);
        stack02.push(20);
        Integer[] arr = stack02.getArr();
        assertEquals(20,arr[1]);
        assertEquals(10,arr[0]);
    }

    @Test
    @DisplayName("pop ok?")
    void pushAndPop(){
        Stack02 stack02 = new Stack02();
        stack02.push(10);
        stack02.push(20);

        assertEquals(20,stack02.pop());
        assertEquals(10,stack02.pop());
        // 스택이 비어있었을 땐 ?
        // Exception 예외의 검증
        assertThrows(RuntimeException.class, ()->{
            stack02.pop();    
        });
        
    }

    @Test
    @DisplayName("isEmpty?")
    void isEmpty(){
        Stack02 stack02 = new Stack02();

        assertTrue(stack02.isEmpty());
        stack02.push(10);
        assertFalse(stack02.isEmpty());
        stack02.pop();
        assertTrue(stack02.isEmpty());
    }

    @Test
    @DisplayName("peek?")
    void peek(){
        Stack02 stack02 = new Stack02();
        assertThrows(RuntimeException.class, ()->{
            stack02.peek();
        });

        stack02.push(10);
        assertEquals(10, stack02.peek());

    }
}