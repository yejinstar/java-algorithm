package org.example.dynamic;

public class LCSTest {

    public static void LCS(String str1, String str2) {
        int[][] dp = new int[str2.length()][str1.length()];

        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                System.out.printf("i: %s, j: %s\n",str2.charAt(i),
                        str1.charAt(j));
            }
        }
    }

    public static void main(String[] args) {
        String str1 = "ABCDCBA";
        String str2 = "DCABDC";
        LCS(str1, str2);
    }
}
