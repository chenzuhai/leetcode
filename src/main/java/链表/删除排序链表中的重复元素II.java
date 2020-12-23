package 链表;

import entity.ListNode;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/11/2
 */
public class 删除排序链表中的重复元素II {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return head;
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode p = preHead;
        ListNode q = preHead.next;
        while (q!=null&&q.next!=null){
            if(q.val==q.next.val){
                while (q.next!=null&&q.val==q.next.val){
                    q = q.next;
                }
                p.next = q.next;
                q = q.next;
            }else {
                q = q.next;
                p = p.next;
            }
        }
        return preHead.next;
    }
}
