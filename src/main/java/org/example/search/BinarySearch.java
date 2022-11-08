package org.example.search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("n : "+ n+ " target : "+target);
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        int idx = -1;
        int middle = n/2;
        boolean flag = false;
        while(!flag){
            if (nums[middle] == target) {
                idx = middle;
            } else if (nums[middle]<target) {
                middle /= 2;
                continue;
            } else{
                middle += middle / 2;
            }
        }
        System.out.println(idx);
    }
}
