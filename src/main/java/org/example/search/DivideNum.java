package org.example.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideNum {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        int N = arr.length;
        List<Integer> list = new ArrayList<Integer>();

        //나누어 떨어지면 리스트에 저장
        for (int i = 0; i < N; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        int listN = list.size();

        //리스트에 나누어 지는 수가 없을 경우
        if (listN == 0){
            /*answer = new int[1];
            answer[0] = -1;*/
            answer = new int[]{-1};
            return answer;
        }

        //리스트를 배열로
        answer = new int[listN];
        for (int i = 0; i < listN; i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);
        return answer;
    }
}
