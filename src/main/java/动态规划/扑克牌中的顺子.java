package 动态规划;

import java.util.HashSet;

/**
 * @author Chen Zuhai
 * @Date 2021-05-19 18:27
 * @email: chenzuhai@induschain.cn
 */
public class 扑克牌中的顺子 {
    public boolean isStraight(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int max = 0;
        int min = 14;
        for (int num : nums) {
            if(num==0)continue;
            if(hashSet.contains(num))return false;
            max = Math.max(num,max);
            min = Math.min(num,min);
            hashSet.add(num);
        }
        return max-min<5;
    }
}
