package org.example.dynamic;

import java.util.Arrays;

public class LCSTest {

    public static void LCS(String str1, String str2) {
        int[][] dp = new int[str2.length()+1][str1.length()+1];

        for (int i = 1; i <= str2.length(); i++) {
            for (int j = 1; j <= str1.length(); j++) {
                if (str2.charAt(i-1) == str1.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                System.out.printf("i: %s, j: %s, dp: %d\n", str2.charAt(i-1),
                        str1.charAt(j-1), dp[i][j]);
            }
        }

        for (int i = 0; i <= str2.length(); i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

    }

    public static void main(String[] args) {
        String str1 = "ABCDCBA";
        String str2 = "DCABDC";
        LCS(str1, str2);
    }
}
