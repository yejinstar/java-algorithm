package org.example.prime;

import java.util.Arrays;

public class RewindPrime {

    public int solution(int n) {
        int answer = 0;
        //

        int[] arrN = new int[n];
        int idx = 0;

        for (int i = 2; i <= n ; i++) {
            arrN[i-2] = i;
        }

        for (int i = 2; i <= n ; i++) {
            arrN[i-2] = i;
            if (arrN[i-2] % 2 == 0 && arrN[i-2] > 2){
                arrN[i-2] = 0;
            }
        }

        //
        System.out.println(Arrays.toString(arrN));
        return answer;
    }

    public static void main(String[] args) {
        int N = 50;
        RewindPrime rp = new RewindPrime();
        System.out.println(rp.solution(N));
    }
}
