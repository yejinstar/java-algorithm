package org.example.search;

public class HarshadTest {
    public boolean solution(int x) {
        boolean answer = true;

        int sumOfDigit = 0;
        int oringinX = x;
        while(x>0){ // 주어진 수 x의 자릿수르 모두 더한다
            sumOfDigit += x % 10;
            x /= 10;
        }

        if (oringinX % sumOfDigit != 0) { // 자릿수의 합으로 나눠지면 하샤드 수니까
            answer = false; // 안 나눠지면 false로 만들기 
        }

        return answer;
    }
}
