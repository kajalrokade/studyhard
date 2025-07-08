package practice.src.DSA.Amazon;

import java.util.*;

/**
 * Team of developers at Amazon is working on a feature that checks the strength of a password as it is set by a user.
 *
 * Analysts found that people use their personal information in passwords, which is insecure. The feature searches for the
 * presence of a reference string as a subsequence of any permutation of the password. If any permutation contains the reference string as a subsequence,
 * then the feature determines the minimum cost to remove characters from password so that no permutation contains the string reference as a subsequence.
 *
 * The removal of any character has a cost given in an array, cost, with 26 elements that represent the cost to replace 'a' (cost[0]) through 'z' (cost[25]).
 * Given two strings password and reference, determine the minimum total cost to remove characters from password so that no permutation contains the string reference as a subsequence.
 *
 * Note:
 *
 * A permutation is a sequence of integers from 1 to n of length n containing each number exactly once, for example [1,3, 2) is a permutation while (1, 2, 1] is not.
 * A subsequence is a sequence that can be derived from another sequence by deleting some or elements, without changing the order of the remaining elements. For example,
 * given the string "abcde", the following are subsequences: "a", "ace", "bde", "bde" etc. while sequences like "dea", "acbde" are not subsequences.
 *
 *  password = "abcdcbcb", reference = "bcb", cost = [2, 3, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0,0,0]
 * Output: 3
 */
public class PasswordSecurity {
    public static long minCost(String password, String reference, int[] cost) {
        int m = password.length();
        int n = reference.length();
        long[][] dp = new long[m + 1][n + 1];

        // Fill DP table with max values (indicating infinite removal cost)
        for (long[] row : dp) {
            Arrays.fill(row, Long.MAX_VALUE);
        }

        dp[0][0] = 0; // No cost to remove nothing

        // Process each character in the password
        for (int i = 1; i <= m; i++) {
            char pc = password.charAt(i - 1);
            int charCost = cost[pc - 'a'];

            for (int j = 0; j <= n; j++) {
                // Case 1: Ignore current character (do not remove)
                dp[i][j] = dp[i - 1][j];

                // Case 2: If character matches reference[j], consider removing it
                if (j > 0 && pc == reference.charAt(j - 1) && dp[i - 1][j - 1] != Long.MAX_VALUE) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + charCost);
                }
            }
        }

        // Result is the minimum cost required to break reference subsequence
        return dp[m][n] == Long.MAX_VALUE ? -1 : dp[m][n];
    }

    public static void main(String[] args) {
        String password = "abcdcbcb";
        String reference = "bcb";
        int[] cost = {2, 3, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println(minCost(password, reference, cost)); // Output: 3
    }
}
