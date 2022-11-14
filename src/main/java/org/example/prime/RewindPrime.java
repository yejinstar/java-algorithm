package org.example.prime;

import java.util.Arrays;

public class RewindPrime {

    public int solution(int n) {
        int answer = 0;
        //

        int[] arrN = new int[n-1];
        int idx = 0;

        // 2~50까지 채우기
        for (int i = 2; i <= n ; i++) {
            arrN[i-2] = i;
        }
        // 2보다 큰 2의 배수들 지우기
        for (int i = 2; i*i <=n ; i++) {
            for (int j = i-2; j <= n-2 ; j += i) {
                if (arrN[j] > i){
                    arrN[j] = 0;
                }
            }
        }

        //
        System.out.println(Arrays.toString(arrN));

        for (int i = 0; i < arrN.length; i++) {
            if (arrN[i]!=0){
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int N = 50;
        RewindPrime rp = new RewindPrime();
        System.out.println(rp.solution(N));
    }
}
