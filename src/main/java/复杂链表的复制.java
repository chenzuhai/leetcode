import entity.Node;

import java.util.HashMap;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/6/18
 */

public class 复杂链表的复制 {
    HashMap<Node, Integer> origin = new HashMap<Node, Integer>();
    HashMap<Integer, Node> res = new HashMap<Integer, Node>();

    public Node copyRandomList(Node head) {

        Node pre = new Node(0);
        Node p = head;
        Node q = pre;
        int i = 0;
        while (p != null) {
            q.next = new Node(p.val);
            q = q.next;
            origin.put(p.random, i);
            res.put(i, q);
            p = p.next;
            i++;
        }
        p = head;
        q = pre.next;

        while(p!=null){
            int randomIndex = origin.get(p);
            q.random = res.get(randomIndex);
            p=p.next;
            q=q.next;
        }

        return pre.next;

    }
}
