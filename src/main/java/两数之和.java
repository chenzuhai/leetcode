import java.util.HashMap;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/8
 */


public class 两数之和 {

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        if(len<2)return new int[]{};
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < len; i++) {
            if(hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]),i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
