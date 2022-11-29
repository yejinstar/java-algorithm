package org.example.sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDigit {

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

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 7, 7, 8, 13, 14, 16, 18, 203};
        System.out.println(Arrays.toString(maxDigits(arr)));
    }
}
