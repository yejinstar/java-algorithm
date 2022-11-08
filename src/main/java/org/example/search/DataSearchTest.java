package org.example.search;

import java.util.Scanner;

public class DataSearchTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }
        String target = sc.next();
        boolean flag = false;
        int idx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == Integer.parseInt(target)){
                System.out.println(i+1);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(idx);
        }
    }
}
