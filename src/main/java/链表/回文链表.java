package 链表;

import entity.ListNode;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/23 22:53
 */
public class 回文链表 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while (true) {
            fast = fast.next.next;
            slow = slow.next;
            //说明个数为偶数，刚刚好
            if (fast == null) {
                ListNode head2 = reverseList(slow);
                ListNode p = head;
                ListNode q = head2;
                while (q != null) {
                    if (p.val != q.val) return false;
                    p = p.next;
                    q = q.next;
                }
                return true;
            } else if (fast.next == null) {
                //说明是奇数个
                ListNode head2 = reverseList(slow.next);
                ListNode p = head;
                ListNode q = head2;
                while (q != null) {
                    if (p.val != q.val) return false;
                    p = p.next;
                    q = q.next;
                }
                return true;
            }
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode p = reverseList(head.next);
        //下一个节点 指向 这个节点前面的节点
        head.next.next = head;
        //前面这个节点指向空
        head.next = null;

        return p;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        //System.out.println(isPalindrome(node1));
    }
}
