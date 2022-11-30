package org.example.tree;

import java.util.Scanner;

public class FindDistance {

    public static int goUp(int a, int b) {
        if(a > b) {
            return goUp(a / 2, b) + 1; // a를 부모 쪽으로
        } else if (a < b) {
            return goUp(a, b / 2) + 1; // b를 부모 쪽으로
        } else { // a == b
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(goUp(a,b));
    }
}
