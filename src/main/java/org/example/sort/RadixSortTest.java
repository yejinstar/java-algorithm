package org.example.sort;

import java.util.Arrays;

public class RadixSortTest {

    public static int[] RadixSort(int[] arr) {
        int[] ans = new int[arr.length];

        int[] radixArr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            radixArr[arr[i]] =arr[i];
        }

        int idx = 0;
        for (int i = 0; i < radixArr.length; i++) {
            if (radixArr[i] == i){
                ans[idx++] =radixArr[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 4, 5, 9, 1, 0};
        System.out.println(Arrays.toString(RadixSort(arr)));
    }
}
