package org.example;
import java.util.*;

public class HateSameNumWithoutStack {

    public int[] solution(int []arr) {
        int[] answer = {};

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        List<Integer> answerl = new ArrayList<Integer>();
        answerl.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (answerl.get(answerl.size()-1) != arr[i]){
                answerl.add(arr[i]);
            }
        }

        answer = new int[answerl.size()];
        for (int i = 0; i < answerl.size(); i++) {
            answer[i] = answerl.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        HateSameNumWithoutStack hsnws = new HateSameNumWithoutStack();
        int[] arr = new int[]{1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(hsnws.solution(arr)));

    }
}
