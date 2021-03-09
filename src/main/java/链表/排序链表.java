package 链表;

import entity.ListNode;

import java.util.List;

/**
 * 归并排序链表
 * @author Zuhai Chen
 * @version 1.0
 * @date 2021/3/8 18:44
 */
public class 排序链表 {
    public ListNode sortList(ListNode head) {
        return sortList(head,null);
    }
    public ListNode sortList(ListNode head,ListNode tail){
        if(head == null){
            return head;
        }
        if(head.next == tail){
            head.next = null;
            return head;
        }
        //通过快慢指针法找到中心
        ListNode fast = head,slow = head;
        while(fast!=tail){
            slow = slow.next;
            fast = fast.next;
            if(fast != tail){
                fast = fast.next;
            }
        }

        ListNode mid = slow;
        ListNode list1 = sortList(head,mid);
        ListNode list2 = sortList(mid,tail);
        ListNode sorted = merge(list1, list2);
        return sorted;
    }

    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode preHead = new ListNode(0);
        ListNode temp = preHead,temp1 = head1,temp2 = head2;
        while(temp1!=null&&temp2!=null){
            if(temp1.val<temp2.val){
                temp.next = temp1;
                temp1 = temp1.next;
            }else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if(temp1!=null){
            temp.next = temp1;
        }else if(temp2!=null){
            temp.next = temp2;
        }
        return preHead.next;
    }
}
