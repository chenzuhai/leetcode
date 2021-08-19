package 动态规划;

/**
 * @author Chen Zuhai
 * @Date 2021-05-19 18:57
 * @email: chenzuhai@induschain.cn
 */
public class 买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
