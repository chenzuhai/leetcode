import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/20
 */

public class 去除重复字母 {

    public static String removeDuplicateLetters(String s) {

        Deque<Character> stack = new ArrayDeque<Character>();

        //保存最后一次出现的下标
        int[] lastIndex = new int[26];
        //保存是否在栈中
        boolean[] visited = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i)-'a'] = i;
        }
        for (int i = 0; i < s.length(); i++) {
            if(visited[s.charAt(i)-'a']){
                continue;
            }
            while(!stack.isEmpty() && lastIndex[stack.peekLast()-'a'] > i && stack.peekLast() > s.charAt(i) ){
                Character character = stack.removeLast();
                visited[character-'a'] = false;
            }
            stack.addLast(s.charAt(i));
            visited[s.charAt(i)-'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (Character c: stack){
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("ecbacba"));
    }

}
