package 动态规划;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/10/21
 */
public class 不同路径II {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0) return 0;


        int nr = obstacleGrid.length;       //获取行数
        int nc = obstacleGrid[0].length;    //获取列数

        int[][] res = new int[nr][nc];
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if (obstacleGrid[i][j] == 1) res[i][j] = 0;
                else if (i == 0 && j == 0) {
                    res[i][j] = 1;
                } else if (i == 0 && j != 0) {
                    res[i][j] = res[i][j - 1];
                } else if (i != 0 && j == 0) {
                    res[i][j] = res[i - 1][j];
                } else {
                    res[i][j] = res[i - 1][j] + res[i][j - 1];
                }
            }
        }
        return res[nr - 1][nc - 1];
    }
}
