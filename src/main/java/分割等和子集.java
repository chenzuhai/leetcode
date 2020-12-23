import java.util.Arrays;
import java.util.List;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/10/11
 */
public class 分割等和子集 {
    public static  boolean canPartition(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        if(sum%2!=0)return false;//如果和为奇数直接退出
        int target = sum/2;
        if(nums[len-1]>target)return false;
        for (int i = 0; i < len; i++) {

        }



        return false;
    }
    public static boolean helper(int[] nums){
        return false;
    }


    public static void main(String[] args) {
        int[] a = new int[]{1,2,35,4,5};
        canPartition(a);
    }
}
