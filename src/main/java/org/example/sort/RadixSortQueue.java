package org.example.sort;

import java.util.*;

public class RadixSortQueue {

    public static int[] maxDigits(int[] arr) {
        int[] ans;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                set.add(1);
            } else {
                set.add((int) (Math.log10(arr[i] + 1)));
            }
        }
        ans = new int[set.size()];
        int idx = 0;
        for (Integer num :
                set) {
            ans[idx++] = num;
        }
        Arrays.sort(ans);

        return ans;
    }

    public static int[] RadixSort(int[] arr, int digit) {
        int[] ans = new int[arr.length];

        Queue<Integer>[] queueArr = new Queue[10];
        for (int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new ArrayDeque<>();
        }

        int divisor;
        for (int i = 0; i < arr.length; i++) {
            divisor = (int) (Math.pow(10, digit));
            queueArr[Math.floorDiv(arr[i],divisor) % 10].add(arr[i]);
        }

        int idx = 0;
        for (int i = 0; i < queueArr.length; i++) {
            while (!queueArr[i].isEmpty()) {
                ans[idx++] = queueArr[i].poll();
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 8, 11228, 13, 111, 7, 16, 7, 0, 14};
        int[] digits =maxDigits(arr);
        for (int i = 0; i < digits.length; i++) {
            arr = RadixSort(arr,digits[i]);
        }
        System.out.println(Arrays.toString(arr));
    }


}
