class Solution {
    public int maxPalindromes(String s, int k) {
        int n=s.length();
        boolean[][] p = new boolean[n][n];
        for (int i=n-1;i>=0;i--) {
            for (int j=i;j<n;j++) {
                if (s.charAt(i)==s.charAt(j) &&
                    (j-i<=1||p[i + 1][j - 1])) {
                    p[i][j]=true;
                }
            }
        }

        int[] dp = new int[n + 1];

        for (int i = 0; i < n; i++) {
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);

            for (int j = i + k - 1; j < n; j++) {
                if (p[i][j]) {
                    dp[j + 1] = Math.max(dp[j + 1], dp[i] + 1);
                }
            }
        }

        return dp[n];
    }
}
