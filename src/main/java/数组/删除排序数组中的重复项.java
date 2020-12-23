package 数组;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/11/2
 */
public class 删除排序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public int removeDuplicates2(int[] nums) {
        int i=0;
        for(int n:nums){
            if(i<1 || n!=nums[i-1]){
                nums[i++] = n;
            }
        }
        return i;
    }
}
