package org.example.prime;

import java.util.ArrayList;
import java.util.List;

public class RemoveMultipleOf2 {

    public int solution(int n) {
        int answer = 0;
        int[] arrN = new int[n];
        boolean[] arrCheck = new boolean[n];
        int idx = 0;
        //리스트에 2부터 n까지 넣기
        for (int i = 2; i <= n ; i++) {
            arrN[idx] = i;
            arrCheck[idx] = true;
            idx++;
        }

        for (int i = 2; i*i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if(arrN[j]%i == 0 && arrN[j] > i){
                    arrCheck[j] = false;
                }
            }
        }

        for (boolean c:
             arrCheck) {
            if (c == true){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int N = 50;
        RemoveMultipleOf2 rmo = new RemoveMultipleOf2();
        System.out.println(rmo.solution(N));
    }
}
