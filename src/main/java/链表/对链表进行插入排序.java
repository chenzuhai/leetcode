package 链表;

import entity.ListNode;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2021/3/9 19:10
 */
public class 对链表进行插入排序 {
    public ListNode insertionSortList(ListNode head) {
        ListNode curr = head;
        ListNode preHead = new ListNode(Integer.MIN_VALUE);
        ListNode temp;
        while(curr!=null){
            ListNode next = curr.next;
            int val = curr.val;
            temp = preHead;
            while(temp!=null){
                if(val>=temp.val&&temp.next==null){
                    temp.next = curr;
                    curr.next = null;
                    break;
                }else if(val>=temp.val&&val<temp.next.val){
                    curr.next = temp.next;
                    temp.next = curr;
                    break;
                }
                temp = temp.next;
            }
            curr = next;
        }
        return preHead.next;
    }
}
