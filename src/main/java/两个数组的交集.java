import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/11/2
 */
public class 两个数组的交集 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int num:nums1){
            if(hashMap.containsKey(num)){
                continue;
            }else {
                hashMap.put(num,0);
            }
        }
        for(int num:nums2){
            if(hashMap.containsKey(num)){
                hashMap.put(num,1);
            }
        }
        List<Integer> res = new LinkedList<>();
        for(int key:hashMap.keySet()){
            if(hashMap.get(key)==1){
                res.add(key);
            }
        }
        int[] _res = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            _res[i] = res.get(i);
        }

        return _res;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        intersection(nums1,nums2);
    }
}
