import entity.ListNode;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/6/18
 */
public class 两两交换链表中的节点 {

    public ListNode swapPairs2(ListNode head) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;


        ListNode p = preHead;

        ListNode q = preHead.next;
        if(head==null)return head;
        ListNode r = q.next;
        if(r==null)return head;
        ListNode s = r.next;

        while(q!=null){
            p.next = r;
            r.next = q;
            q.next = s;

            p = q; //新的前置节点
            q = q.next;//需要交换的第一个系欸但
            if(q==null)break;
            r = q.next;
            if(r==null)break;
            s = r.next;
        }
        return preHead.next;
    }

    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)return head;

        ListNode newHead = head.next;

        head.next = swapPairs(newHead.next);

        newHead.next = head;

        return newHead;
    }
}
