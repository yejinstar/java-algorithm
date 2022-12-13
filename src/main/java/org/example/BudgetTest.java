package org.example;

public class BudgetTest {

    public int solution(int[] d, int budget) {
        int answer = 0;

        for (int i = 0; i < d.length -1 ; i++) {
            for (int j = i + 1; j < d.length; j++) {
                int tmp = 0;
                if (d[i] > d[j]) {
                    tmp = d[i];
                    d[i] = d[j];
                    d[j] = tmp;
                }
            }
        }
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget >= 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        BudgetTest budgetTest = new BudgetTest();
        int[] arr = new int[] {1, 3, 2, 5, 4};
        System.out.println(budgetTest.solution(arr,9));
    }
}
