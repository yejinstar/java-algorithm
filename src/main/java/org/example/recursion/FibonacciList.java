package org.example.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciList {
    public static int fibo(int input) {
        List<Integer> fibonacciNums = new ArrayList<>();
        fibonacciNums.add(1);
        fibonacciNums.add(1);
        for (int i = 2; i < input; i++) {
            fibonacciNums.add(fibonacciNums.get(i - 1) + fibonacciNums.get(i - 2));
        }
        return fibonacciNums.get(input - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(fibo(input));
    }
}
