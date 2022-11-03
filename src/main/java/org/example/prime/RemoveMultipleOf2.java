package org.example.prime;

public class RemoveMultipleOf2 {

    public int solution(int n) {
        int answer = 0;
        int[] arrN = new int[n];
        boolean[] arrCheck = new boolean[n];
        int idx = 0;
        //리스트에 2부터 n까지 넣기
        for (int i = 2; i <= n ; i++) {
            arrN[idx] = i;
            arrCheck[idx] = true;
            idx++;
        }
        // 루트n 만큼 돌리면서 배수들 false 처리하기
        for (int i = 2; i*i <= n; i++) {
            for (int j = i-2; j < n; j+=i) {
                if(arrN[j] > i){
                    arrCheck[j] = false;
                    System.out.printf("%d ", arrN[j]); // 소수의 배수들 출력해보기
                }
            }
            System.out.println();
        }
        // true 가 소수니까 소수의 갯수 구하기
        for (boolean c:
             arrCheck) {
            if (c == true){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int N = 50;
        RemoveMultipleOf2 rmo = new RemoveMultipleOf2();
        System.out.println(rmo.solution(N));
    }
}
