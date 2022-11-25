package org.example.recursion;

import java.util.Scanner;

public class GcdTest {

    private static int gcdsolv(int start, int end) {

        if (start == end){
            return start;
        }

        if (start < end){
            return gcdsolv(end, start);
        }

        return gcdsolv(start - end, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(gcdsolv(start,end));
    }

}
