import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/11/16
 */
public class 移掉K位数字 {
    public String removeKdigits(String num, int k) {
        Deque<Character> deque = new LinkedList<>();
        for (Character c : num.toCharArray()) {
            while (!deque.isEmpty() && k > 0 && c < deque.peekLast()) {
                deque.pollLast();
                k--;
            }
            deque.offerLast(c);
        }
        for (int i = 0; i < k; i++) {
            deque.pollLast();
        }
        StringBuilder sb = new StringBuilder();
        boolean zero = true;
        while (!deque.isEmpty()) {
            char c = deque.pollFirst();
            if (zero && c == '0') {
                continue;
            }
            zero = false;
            sb.append(c);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
