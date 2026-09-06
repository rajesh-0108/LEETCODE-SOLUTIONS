class Solution {
    public int solve(int i, int j, String s, String t, int[][] memo) {
        if (j == t.length())
            return 1;

        if (i == s.length())
            return 0;

        if (memo[i][j] != -1)
            return memo[i][j];

        int notTake = solve(i + 1, j, s, t, memo);
        int take = 0;

        if (s.charAt(i) == t.charAt(j)) {
            take = solve(i + 1, j + 1, s, t, memo);
        }

        return memo[i][j] = take + notTake;
    }

    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[][] memo = new int[n][m];
        for (int[] row : memo)
            java.util.Arrays.fill(row, -1);

        return solve(0, 0, s, t, memo);
    }
}