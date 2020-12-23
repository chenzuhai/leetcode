package 链表;

import entity.ListNode;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/10/29
 */
public class 旋转链表 {

    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null)return null;
        ListNode p =head;
        ListNode q = head;
        ListNode last = head;
        while(last.next!=null){
            last=last.next;//找到最后一个节点
        }
        int size = 0;
        while(p!=null){
            p = p.next;
            size++;
        }
        p = head;

        for(int i=0;i< k%size;i++){
            p = p.next;
        }

        while(p.next!=null){
            p = p.next;
            q = q.next;
        }
        ListNode new_head = q.next;

        last.next = head;
        q.next=null;

        return new_head;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        rotateRight(node,0);
    }
}
