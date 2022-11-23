package org.example.recursion;

import java.util.Scanner;

public class Factorial {
    public static int fact(int input) {

        if (input == 1) {
            return 1;
        }
        int ans = input;
        return ans * fact(input - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(fact(input));
    }
}
