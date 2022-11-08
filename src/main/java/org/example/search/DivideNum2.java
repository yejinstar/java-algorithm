package org.example.search;

import java.util.PriorityQueue;

public class DivideNum2 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        PriorityQueue<Integer> list = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) list.add(arr[i]);
        }

        if(list.size() == 0) return new int[]{-1};

        // list를 Array로 바꾸고
        answer = new int[list.size()];
        int idx = 0;
        while(!list.isEmpty()){
            answer[idx++] = list.poll();
        }

        return answer;
    }
}
