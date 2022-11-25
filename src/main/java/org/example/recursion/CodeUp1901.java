package org.example.recursion;

import java.util.Scanner;

public class CodeUp1901 {
    public static void recur(int input) {
        if (input == 0) {
            return;
        }
        System.out.println(input);
        recur(input-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        recur(input);
    }
}
