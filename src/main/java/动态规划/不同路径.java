package 动态规划;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/10/21
 */
public class 不同路径 {
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] == 0) {
                    dp[i][j] = 1;
                } else if((i == 0 && j != 0) || (i != 0 && j == 0)){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}

