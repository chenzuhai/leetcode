package 动态规划;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/22 22:56
 */
public class 使用最小花费爬楼梯 {

    public int minCostClimbingStairs(int[] cost) {
        int size = cost.length;
        int[] minCost = new int[size+1];
        minCost[0] = 0;
        minCost[1] = 0;
        for (int i = 2; i <= size; i++) {
            //minCost[i] = Math.min(minCost[i-1]+cost[i],minCost[i-1]+cost[i-2]);
            minCost[i] = Math.min(minCost[i - 1] + cost[i-1], minCost[i - 2] + cost[i - 2]);
        }
        return minCost[size];
    }

}
