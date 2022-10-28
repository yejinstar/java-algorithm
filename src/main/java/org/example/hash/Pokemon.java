package org.example.hash;

import java.util.HashSet;
import java.util.Set;

public class Pokemon {

    public int solution(int[] nums) {
        int answer = 0;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int n = nums.length / 2;

        if (set.size() < n) {
            answer = set.size();
        } else {
            answer = n;
        }
        return answer;
    }

}
