package 字符串;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2021/3/9 18:32
 */
public class 删除字符串中的所有相邻重复项 {
    public  static String removeDuplicates(String S) {
        Deque<Character> stack = new LinkedList<>();
        for(Character c:S.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            }else {
                if(c.equals(stack.peekLast())){
                    stack.pollLast();
                    continue;
                }else {
                    stack.addLast(c);
                }
            }

        }
        StringBuilder sb = new StringBuilder();
        Iterator<Character> iterator = stack.iterator();
        while (iterator.hasNext()){
            sb.append(iterator.next());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String a = new String("abbaca");
        System.out.println(removeDuplicates(a));
    }
}
