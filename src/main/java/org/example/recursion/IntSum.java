package org.example.recursion;

import java.util.Scanner;

public class IntSum {
    public static int intSum(int input) {

        if (input == 0) {
            return 0;
        }
        int sum = input;
        return sum + intSum(input - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(intSum(input));
    }
}
