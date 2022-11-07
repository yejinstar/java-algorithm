package org.example.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DivideNum {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        int N = arr.length;
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        list.sort(Comparator.naturalOrder());
        int listN = list.size();
        if (listN == 0){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        answer = new int[listN];
        for (int i = 0; i < listN; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
