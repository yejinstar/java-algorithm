package org.example.dynamic;

import java.util.Arrays;

public class MinCostPathTest {

    public static int MCT(int[][] matrix) {
        int ans = 0;

        int[][] dp = new int[matrix.length][matrix[0].length]; // dp matrix 생성
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && j == 0) { // 첫째칸
                    dp[i][j] = matrix[i][j];
                } else if (i==0 && j != 0) { // 첫째행
                    dp[i][j] = dp[i][j-1] + matrix[i][j];
                } else if (i != 0 && j == 0) { // 첫째열
                    dp[i][j] = dp[i-1][j] + matrix[i][j];
                }
                else { // 나머지 경우
                    dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1])) + matrix[i][j] ;
                }
            }
            System.out.println(Arrays.toString(dp[i]));
        }
        ans=dp[matrix.length-1][matrix[0].length -1 ];
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 3, 2}, {4, 6, 2}, {1, 2, 4}
        };

        System.out.println(MCT(matrix));
    }
}
