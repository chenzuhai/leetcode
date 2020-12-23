package 滑动窗口;

import java.util.HashMap;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/16
 */
public class 无重复字符的最长子串 {


    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int left=0;int res =0;
        for (int right = 0; right < s.length(); right++) {
            if(map.containsKey(s.charAt(right))){
                left = Math.max(left,map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right),right);

            res = Math.max(res,right-left+1);
        }

        return res;
    }

}
