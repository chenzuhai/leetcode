package 动态规划;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/29 16:31
 */
public class 不同的二叉搜索树 {

    /**
     * 不太明白
     * @param n
     * @return
     */
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j-1] * dp[i-j];
            }
        }
        return dp[n];
    }
}
