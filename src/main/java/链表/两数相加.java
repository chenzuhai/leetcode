package 链表;

import entity.ListNode;

import java.util.List;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/9
 */
public class 两数相加 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode preHead = new ListNode(0);
        ListNode temp = preHead;

        int flag = 0;
        while(p1!=null&&p2!=null){
            if(flag+p1.val+p2.val>=10){
                temp.next = new ListNode(flag+p1.val+p2.val-10);
                flag = 1;
            }else{
                temp.next = new ListNode(flag + p1.val + p2.val);
                flag = 0;
            }
            temp = temp.next;
            p1 = p1.next;
            p2 = p2.next;
        }
        while(p1!=null){
            if(flag+p1.val>=10){
                temp.next = new ListNode(flag+p1.val-10);
                flag = 1;
            }else{
                temp.next = new ListNode(flag+p1.val);
                flag = 0;
            }
            temp = temp.next;
            p1 = p1.next;
        }
        while(p2!=null){
            if(flag+p2.val>=10){
                temp.next = new ListNode(flag+p2.val-10);
                flag = 1;
            }else{
                temp.next = new ListNode(flag+p2.val);
                flag = 0;
            }
            temp = temp.next;
            p2 = p2.next;
        }

        if(flag==1){
            temp.next = new ListNode(1);
        }
        return preHead.next;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(5);

        System.out.println(head1.val);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(3);

        head2.next = new ListNode(6);
        head2.next.next = new ListNode(4);



        addTwoNumbers(head1,head2);
    }
}
