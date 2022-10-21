package org.example;

import java.util.Stack;

class SolutionBracket {
    boolean solution(String s) {
        boolean answer = false;
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(st.peek()=='(' && s.charAt(i) == ')'){
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        answer = st.isEmpty();
        return answer;
    }
}

// -------- Stack 없이 풀기 --------
//
//    boolean solution(String s) {
//        boolean answer = false;
//
//        while(s.indexOf("()") >= 0) {
//            s = s.replace("()","");
//        }
//
//        if (s.length() == 0){
//            answer = true;
//        } else{
//            answer = false;
//        }
//        return answer;
//    }


