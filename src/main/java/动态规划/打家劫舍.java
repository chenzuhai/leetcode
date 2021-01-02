package 动态规划;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/23 22:37
 */
public class 打家劫舍 {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        dp[0] = nums[0];
        dp[1] = nums[1];
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }
}
