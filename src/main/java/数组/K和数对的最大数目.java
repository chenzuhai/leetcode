package 数组;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/29 11:55
 */
public class K和数对的最大数目 {

    /**
     * 方法一：排序后用两个指针
     *
     * @param nums
     * @param k
     * @return
     */
    public static int solution_1(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        int res = 0;
        while (i < j) {
            if (nums[i] + nums[j] == k) {
                i++;
                j--;
                res++;
                continue;
            } else if (nums[i] + nums[j] > k) {
                j--;
                continue;
            } else {
                i++;
                continue;
            }
        }
        return res;
    }

    /**
     * 方法二：一遍哈希
     * @param nums
     * @param k
     * @return
     */
    public static int solution_2(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int res = 0;
        for(int num:nums){
            int target = k - num;
            if(hashMap.containsKey(target)&&hashMap.get(target)>0){
                res++;
                hashMap.put(target,hashMap.get(target)-1);
                continue;
            }

            if(hashMap.containsKey(num)){
                //如果存在使用次数+1
                hashMap.put(num,hashMap.get(num)+1);
            }else {
                //不存在默认设置为1
                hashMap.put(num,1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,1,3,4,3};
        System.out.println(solution_2(array, 6));
    }
}
