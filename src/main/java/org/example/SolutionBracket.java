package org.example;

class SolutionBracket {
    boolean solution(String s) {
        boolean answer = false;

        while(s.indexOf("()") >= 0) {
            s = s.replace("()","");
        }

        if (s.length() == 0){
            answer = true;
        } else{
            answer = false;
        }
        return answer;
    }
}

