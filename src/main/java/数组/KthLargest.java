package 数组;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2021/2/11 11:16
 */
public class KthLargest {
    private int KthLargestNum;
    private List<Integer> list;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        Arrays.sort(nums);
        KthLargestNum = nums[nums.length-k];
        LinkedList<Integer> list = new LinkedList<>();
        for(int num:nums){
            list.add(num);
        }
        this.list = list;
        System.out.println(this.list);
    }

    public int add(int val) {
        int i = 0;
        while (i<this.list.size()-1){
            if(val < this.list.get(i)){
                break;
            }
        }
        this.list.add(i);
        System.out.println(this.list);
        return this.list.get(this.list.size()-k);
    }

    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(2, new int[]{5, 6, 4, 3});
        System.out.println(kthLargest.add(10));
    }
}
