package org.example.sort;

import java.util.Arrays;

public class SelectionSortTest {
    public int[] SelectionSort(int arr[]){

        int minIdx = 0;
        int tmp;
        for (int i = 0; i < arr.length-1; i++) {
            minIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
        }
        
        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSortTest sst = new SelectionSortTest();
        System.out.println(Arrays.toString(sst.SelectionSort(arr)));
    }
}
