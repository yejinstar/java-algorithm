package org.example.prime;

public class PrimeTest1 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i ; j++) {
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PrimeTest1 pt1 = new PrimeTest1();
        System.out.println("ans - "+pt1.solution(13));
    }

}
