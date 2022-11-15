package org.example.sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSortTest {

    public int[] QuickSort(int[] arr) {
        int[] answer = {20, 18, 5, 19, 5, 25, 40, 50};

        List<Integer> front = new ArrayList<>();
        List<Integer> pivot = new ArrayList<>();
        List<Integer> end = new ArrayList<>();

        for (int i = 0; i < answer.length; i++) {
            if (i < answer.length / 2) {
                front.add(answer[i]);
            } else if (i == answer.length / 2) {
                pivot.add(answer[i]);
            } else {
                end.add(answer[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
