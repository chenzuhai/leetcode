package 链表;

import entity.ListNode;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2021/3/9 21:03
 */
public class 分隔链表 {
    public ListNode partition(ListNode head, int x) {
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(0);
        ListNode p = head;ListNode temp1=head1;ListNode temp2 = head2;
        ListNode tail = head1;
        while (p!=null){
            if(p.val<x){
                temp1.next = p;
                tail = temp1;
                temp1 = temp1.next;
            }else {
                temp2.next = p;
                temp2 = temp2.next;
            }
            p = p.next;
        }
        tail.next = head2.next;
        return head1.next;
    }
}
