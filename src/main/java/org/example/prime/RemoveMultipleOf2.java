package org.example.prime;

import java.util.ArrayList;
import java.util.List;

public class RemoveMultipleOf2 {

    public int solution(int n) {
        int answer = 0;
        int[] arrN = new int[n];
        int[] arrCheck = new int[n];
        int idx = 0;
        //리스트에 2부터 n까지 넣기
        for (int i = 2; i <= n ; i++) {
            arrN[idx++] = i;
        }

        for (int i = 2; i*i <= n; i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j)%i == 0 && list.get(j) > i){
                    list.remove(j);
                }
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
