import java.util.HashMap;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/16
 */
public class 单词规律 {

    public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split("\\s+");
        HashMap<Character,String> hashMap = new HashMap<>();
        if(arr.length!=pattern.length())return false;

        for (int i = 0; i < pattern.length(); i++) {
            if(hashMap.containsKey(pattern.charAt(i))){
                if(!arr[i].equals(hashMap.get(pattern.charAt(i))))return false;
            }else {
                if(hashMap.containsValue(arr[i])){
                    return false;
                }
            }
            hashMap.put(pattern.charAt(i),arr[i]);

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "ab bb bb aa"));

    }
}
