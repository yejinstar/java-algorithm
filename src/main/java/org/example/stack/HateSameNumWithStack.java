package org.example.stack;

import java.util.*;
public class HateSameNumWithStack {

    public int[] solution(int []arr) {
        int[] answer = {};

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }

        answer = new int[stack.size()];
        int idx = stack.size()-1;
        while (!stack.isEmpty()){
            answer[idx--] = stack.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        HateSameNumWithStack hsnws = new HateSameNumWithStack();
        int[] arr = new int[]{1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(hsnws.solution(arr)));

    }
}
