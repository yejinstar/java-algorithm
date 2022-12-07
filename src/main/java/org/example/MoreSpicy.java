package org.example;

import java.util.PriorityQueue;

public class MoreSpicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }
        while (pq.peek() < K) {
            int mix = 0;
            mix += pq.poll();
            mix += pq.poll() * 2;
            pq.add(mix);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        MoreSpicy moreSpicy = new MoreSpicy();
        int[] arr = {1, 2, 3, 9, 10, 12};
        System.out.println(moreSpicy.solution(arr,7));
    }
}
