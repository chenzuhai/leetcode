package 链表;

import entity.ListNode;

import java.util.List;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/11/2
 */
public class 删除排序链表中的重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return head;
        ListNode p = head;
        ListNode q = head.next;
        while (q!=null){
            if(p.val==q.val){
                p.next = q.next;
                q = p.next;
            }else {
                 p = p.next;
                 q = q.next;
            }
        }
        return head;
    }
}
