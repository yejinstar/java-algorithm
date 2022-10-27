package org.example.java_1025;

import java.util.HashMap;
import java.util.Map;

public class HashSolution {
    public String solution(String[] participant, String[] completion){
        String answer = "";

        Map<String, Integer> memo = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            if(!memo.containsKey(key)){
                memo.put(key, 0);
            }
            memo.put(key, memo.get(key)+1);
        }

        for (int i = 0; i < completion.length; i++) {
            String key = completion[i];
            memo.put(key, memo.get(key)-1);
        }

        for (String key : memo.keySet()) {
            if (memo.get(key) == 1) {
                return key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        HashSolution hs = new HashSolution();
        System.out.println(hs.solution(participant,completion));
    }
}
