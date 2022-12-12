package org.example.greedy;

import java.util.ArrayList;
import java.util.List;

public class MakeBigNum {
    public String solution(String number, int k) {
        String answer = "";
        int ansLen = number.length() - k;
        int idx = 0;
        int remem = 0;
        for (int i = answer.length(); i < ansLen; i++) {
            char max = '0';
            for (int j = idx; j < number.length() - ansLen + answer.length() + 1 ; j++) {

                if (number.charAt(j) == '9'){
                    max = '9';
                    remem = j+1;
                    break;
                }
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    remem = j+1;
                }
            }
            idx = remem;
            answer += max;
        }
        return answer;
    }

    public static void main(String[] args) {
        MakeBigNum makeBigNum = new MakeBigNum();
        System.out.println("#1: " + makeBigNum.solution("1924", 2));
        System.out.println("#2: " + makeBigNum.solution("1231234", 3));
        System.out.println("#3: " + makeBigNum.solution("4177252841", 4));
    }
}
