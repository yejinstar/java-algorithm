package org.example;

import java.util.*;

public class TVChartTest {
    public int[] solution(int k, int[] score) {
        int[] answer = {};

        answer = new int[score.length];
        List<Integer> chart = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {

            if (i <= k - 1) {
                chart.add(score[i]);
                Collections.sort(chart);
                answer[i] = chart.get(0);
                continue;
            }
            if (score[i] > chart.get(0)){
                chart.add(score[i]);
                chart.remove(0);
            }
            Collections.sort(chart);
            answer[i] = chart.get(0);
        }

        return answer;
    }

    public static void main(String[] args) {
        TVChartTest test = new TVChartTest();
        int[] score = new int[]{10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(test.solution(3, score)));
    }
}
