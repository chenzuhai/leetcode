/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/28 13:59
 */
public class 最长回文子串 {

    public static String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }
        int len = s.length();
        int maxSize = 0;
        String res = "";
        //一个字符一个字符的遍历
        for (int i = 0; i < len; i++) {
            int begin = i, end = i;
            while (begin >= 0 && end < len) {
                if(s.charAt(begin)==s.charAt(end) && end-begin+1>maxSize){
                    maxSize = end-begin+1;
                    res = s.substring(begin,end+1);
                }else if (s.charAt(begin)!=s.charAt(end)){
                    break;
                }
                begin--;
                end++;
            }
            begin = i;
            end = i+1;
            while (begin >= 0 && end < len) {
                if(s.charAt(begin)==s.charAt(end) && end-begin+1>maxSize){
                    maxSize = end-begin+1;
                    res = s.substring(begin,end+1);
                }else if (s.charAt(begin)!=s.charAt(end)){
                    break;
                }
                begin--;
                end++;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aacabdkacaa"));
    }
}
