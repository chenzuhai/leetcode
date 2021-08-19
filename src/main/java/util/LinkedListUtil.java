package util;

import entity.ListNode;

/**
 * @author Chen Zuhai
 * @Date 2021-06-30 16:39
 * @email: chenzuhai@induschain.cn
 */
public class LinkedListUtil {
    public static ListNode buildListByArray(int[] array){
        if(array.length==0){
            return null;
        }
        ListNode preHead = new ListNode(0);
        ListNode p = preHead;
        for (int i = 0; i < array.length; i++) {
            p.next = new ListNode(array[i]);
            p = p.next;
        }
        return preHead.next;
    }

    public static void printList(ListNode head){
        ListNode p = head;
        while(p!=null){
            System.out.println(p.val);
            p = p.next;
        }
    }


    public static void main(String[] args) {
        ListNode listNode = buildListByArray(new int[]{1, 2, 3, 4, 5});
        printList(listNode);
    }
}
