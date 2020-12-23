package 数组;

import java.util.HashMap;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/11/2
 */
public class 数组中数字出现的次数II {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int n:nums){
            if(hashMap.containsKey(n)){
                hashMap.put(n,hashMap.get(n)+1);
            }else {
                hashMap.put(n,1);
            }
        }
        for(int key:hashMap.keySet()){
            if(hashMap.get(key)==1){
                return hashMap.get(key);
            }
        }
        return -1;
    }
}
