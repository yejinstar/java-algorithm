package org.example.sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSortTest {

    public List<Integer> sort(List<Integer> list){


        List<Integer> front = new ArrayList<>();
        List<Integer> pivot = new ArrayList<>();
        List<Integer> end = new ArrayList<>();

        pivot.add(list.get(list.size() / 2));

        for (int i = 0; i < list.size(); i++) {
            if (pivot.get(0) > list.get(i)){
                front.add(list.get(i));
            } else if (pivot.get(0) < list.get(i)){
                end.add(list.get(i));
            }
        }
        return /*sort(front) + pivot + sort(end);*/ front;
    }

    public int[] QuickSort(int[] arr) {
        int[] answer = new int[arr.length];

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        sort(list);

        return answer;
    }

    public static void main(String[] args) {
        QuickSortTest quickSortTest = new QuickSortTest();
        int[] arr = {20, 18, 5, 19, 5, 25, 40, 50};
        System.out.println(quickSortTest.QuickSort(arr));
    }
}
