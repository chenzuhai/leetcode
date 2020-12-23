package 动态规划;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/10/21
 */
public class 最小路径和 {

    public int minPathSum(int[][] grid) {
        if(grid.length==0)return 0;
        int nr = grid.length;
        int nc = grid[0].length;
        int[][] dp = new int[nr][nc];
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if(i==0&&j==0){
                    dp[i][j] = grid[i][j];
                }else if(i==0&&j!=0){
                    dp[i][j] = grid[i][j] + dp[i][j-1];
                }else if(i!=0&&j==0){
                    dp[i][j] = grid[i][j] + dp[i-1][j];
                }else{
                    if(dp[i-1][j]<dp[i][j-1]){
                        dp[i][j] = grid[i][j]+dp[i-1][j];
                    }else{
                        dp[i][j] = grid[i][j]+dp[i][j-1];
                    }
                }
            }
        }
        return dp[nr-1][nc-1];
    }
}
