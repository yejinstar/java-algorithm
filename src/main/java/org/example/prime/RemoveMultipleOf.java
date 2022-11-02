package org.example.prime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMultipleOf {

    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();

        //리스트에 2부터 n까지 넣기
        for (int i = 2; i <= n ; i++) {
            list.add(i);
        }

        //출력
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        return answer;
    }

    public static void main(String[] args) {
        int N = 50;
        RemoveMultipleOf rmo = new RemoveMultipleOf();
        System.out.println(rmo.solution(N));
    }
}
