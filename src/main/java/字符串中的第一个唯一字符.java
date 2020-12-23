import java.util.*;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/23 20:43
 */
public class 字符串中的第一个唯一字符 {
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
                continue;
            }
            hashMap.put(s.charAt(i),0);
        }
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i)) < 1) {
                return i;
            }
        }
        return -1;
    }
    static class Pair{
        char c;
        public Pair(char c, int pos) {
            this.c = c;
            this.pos = pos;
        }
        int pos;

    }
    public static int secondWay(String s){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!hashMap.containsKey(c)){
                hashMap.put(c,i);
                queue.offer(new Pair(c,i));
            }else {
                hashMap.put(c,-1);
                while(!queue.isEmpty()&&hashMap.get(queue.peek().c)==-1){
                    queue.poll();
                }
            }
        }
        return queue.isEmpty()? -1 : queue.peek().pos;

    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
