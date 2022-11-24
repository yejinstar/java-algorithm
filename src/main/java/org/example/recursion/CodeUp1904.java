package org.example.recursion;

import java.util.Scanner;

public class CodeUp1904 {
    public static void recur(int start, int end) {
        if (start > end) {
            return;
        }
        if (start % 2 == 1){
            System.out.printf("%d ",start);
        }
        recur(start+1,end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        recur(start,end);
    }
}
