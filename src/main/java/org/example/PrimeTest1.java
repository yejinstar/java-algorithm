package org.example;

public class PrimeTest1 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if(n%i !=0){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        PrimeTest1 pt1 = new PrimeTest1();
        System.out.println(pt1.solution(10));
    }

}
