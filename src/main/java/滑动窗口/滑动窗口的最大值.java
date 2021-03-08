package 滑动窗口;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2021/1/2 12:35
 */
public class 滑动窗口的最大值 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[len-k+1];
        for (int i = 0; i < nums.length; i++) {
            while(!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.addLast(i);
            //超出窗口的最大值poll出去
            while(!deque.isEmpty() && deque.peekFirst() <= i-k){
                deque.pollFirst();
            }
            //产生窗口
            if(i+1 >= k){
                res[i+1-k] = nums[deque.peekFirst()];
            }
        }
        return res;
    }
}
