package org.example.search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("n : " + n + " target : " + target);
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));

        int startIdx = 0;
        int midIdx;
        int endIdx = n - 1;
        while (startIdx <= endIdx) {
            midIdx = (startIdx + endIdx) / 2;
            if (nums[midIdx] > target) {
                endIdx = midIdx - 1;
            } else if (nums[midIdx] < target) {
                startIdx = midIdx + 1;
            } else {
                System.out.println(midIdx + 1);
                break;
            }
        }

    }
}
