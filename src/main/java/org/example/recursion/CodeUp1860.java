package org.example.recursion;

import java.util.Scanner;

public class CodeUp1860 {
    public static void recur(int input) {
        if (input == 0) {
            return;
        }
        recur(input-1);
        star(input);
        System.out.printf("\n");
    }

    public static void star(int input) {
        if (input == 0){
            return;
        }
        star(input - 1);
        System.out.printf("%d ",input);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        recur(input);
    }
}
