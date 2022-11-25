package org.example.recursion;

import java.util.Scanner;

public class GcdTest2 {

    private static int gcdsolv(int start, int end) {

        while (!(start == end)){
//            System.out.println(start +" + " +end);
            if (start < end){
                int tmp = start;
                start = end;
                end = tmp;
            }
            start -= end;
        }
        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(gcdsolv(start,end));
    }

}
