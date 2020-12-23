package 链表;

import entity.ListNode;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/11/3
 */
public class 反转链表 {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    //递归
    public ListNode reverseList2(ListNode head) {
        if(head==null||head.next==null)return head;

        ListNode p = reverseList(head.next);
        head.next.next = head; //下一个节点 指向 这个节点前面的节点
        head.next = null;//前面这个节点指向空

        return p;
    }
}
