package org.example.recursion;

import java.util.Scanner;

public class DigitSum {
    public static int digitSum(int input) {

        if (input == 0) {
            return 0;
        }
        int ans = input % 10;
        return ans + digitSum(input / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(digitSum(input));
    }
}
