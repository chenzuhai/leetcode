package 数组;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/23 22:26
 */
public class 只出现一次的数字 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }
}
