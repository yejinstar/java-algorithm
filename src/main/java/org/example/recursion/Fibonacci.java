package org.example.recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int fibo(int input) {

        if (input == 1 || input == 2) {
            return 1;
        }
        int ans = input;
        return fibo(input-1) + fibo(input-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(fibo(input));
    }
}
