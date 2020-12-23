import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/10 /18
 */
public class 特殊数组的特征值 {

    public int specialArray(int[] nums) {
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 1; i <= nums[len-1]; i++) {
            if(len-i<0)continue;
            if(nums[len-i]>=i){
                if(len-1-i<0||nums[len-1-i]<i)return i;
            }
        }
        return -1;
    }

}
