package org.example;

import java.util.Arrays;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        /*
         * 1. 5*5 배열을 만든다
         * 2. 들어온 값을 5번 반복하면서 2진수로 만든다
         * 3. 한 칸에 0이랑 1을 넣어준다
         * 4. 출력할 때 1인 곳은 #으로 표시해서 5번 출력한다.
         * */

        /*String[] sArr1 = new String[n];
        String[] sArr2 = new String[n];
        for (int i = 0; i < n; i++) {
            // arr1
            for (int j = 0; j < n; j++) {
                String binStr1 = getBinaryString(arr1[i]);
                String binStr2 = getBinaryString(arr2[i]);
                sArr1[i] = "0".repeat(n - binStr1.length()) + binStr1;
                sArr2[i] = "0".repeat(n - binStr2.length()) + binStr2;
            }
        }
        System.out.println(Arrays.toString(sArr1));
        System.out.println(Arrays.toString(sArr2));*/

        answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i])
                    .replace("1", "#")
                    .replace("0", " ");
            answer[i] = " ".repeat(n - answer[i].length()) + answer[i];

        }

        return answer;

    }

    private String getBinaryString(int i) {
        String ans = "";
        while (i > 0) {
            ans += i % 2;
            i /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        SecretMap secretMap = new SecretMap();
        int[] arr1 = {9, 29, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(secretMap.solution(5, arr1, arr2)));
    }
}
