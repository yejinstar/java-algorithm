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

        //이진수로 바꾸는 로직
        int a = 6;
        int[] ans = new int[a / 2];
        int idx = a/2-1;
        while (a > 0) {
            ans[idx--] = a % 2;
            a /= 2;
        }
        System.out.println(Arrays.toString(ans));

        return answer;
    }

    public static void main(String[] args) {
        SecretMap secretMap = new SecretMap();
        int[] arr1 = {9, 29, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(secretMap.solution(5, arr1, arr2));
    }
}
