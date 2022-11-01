package org.example.hash;

import java.util.HashSet;
import java.util.Set;

public class Pokemon {

    public int solution(int[] nums) {
        int answer = 0;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) { // set에 중복없이 실험실에 있는 폰켓몬의 종류 번호를 넣어준다.
            set.add(nums[i]);
        }
        int n = nums.length / 2; // 데려갈 수 있는 최대 폰켓몬의 수

        if (set.size() < n) { // 데려갈 수 있는 숫자보다 실험실에 있는 폰켓몬의 종류가 작으면
            answer = set.size(); // 실험실에 있는 종류가 가장 많은 종류
        } else {
            answer = n; // 실험실에 있는 폰켓몬의 종류가 데려갈 수 있는 수보다 크면 데려갈 수 있눈 숫자가 가장 많은 종류
        }
        return answer;
    }

}
