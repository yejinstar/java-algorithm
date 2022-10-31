package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] studentA = {1, 2, 3, 4, 5}; // A가 찍는 법
        int[] studentB = {2, 1, 2, 3, 2, 4, 2, 5}; // B가 찍는 법
        int[] studentC = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // C가 찍는 법

        int[] score = {0, 0, 0}; // 학생들의 점수

        for (int j = 0; j < answers.length; j++) { // 문제 수 만큼 반복문 돌리면서 맞으면 점수 추가
            if (answers[j] == studentA[j%5])
                score[0] += 1;
            if (answers[j] == studentB[j%8])
                score[1] += 1;
            if (answers[j] == studentC[j%10])
                score[2] += 1;
        }

        int max = 0;
        for (int i = 0; i < score.length; i++) {
            if(max < score[i])
            {
                max = score[i];
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if(max == score[i])
            {
                list.add(i+1);
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Test test = new Test();
        int[] arr = {1, 3, 2, 4, 2};
        int[] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(test.solution(arr1)));
    }

}
