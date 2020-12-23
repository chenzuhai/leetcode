package 数组;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/11/2
 */
public class 删除排序数组中的重复项II {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int n:nums){
            if(i<2 || n!=nums[i-2]){
                nums[i++] = n;
            }
        }
        return i;
    }
}
