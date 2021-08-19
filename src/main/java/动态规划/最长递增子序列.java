package 动态规划;

/**
 * @author Chen Zuhai
 * @Date 2021-05-19 14:16
 * @email: chenzuhai@induschain.cn
 */
public class 最长递增子序列 {

    public int lengthOfLIS(int[] nums) {
        if(nums.length==0)return 0;
        int max = 1;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for(int i=1;i<nums.length;i++){
            dp[i] = 1;
            for(int j =0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            max = Math.max(dp[i],max);
        }
        return max;
    }

}
