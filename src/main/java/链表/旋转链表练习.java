package 链表;

import entity.ListNode;
import util.LinkedListUtil;

/**
 * @author Chen Zuhai
 * @Date 2021-06-30 16:27
 * @email: chenzuhai@induschain.cn
 */
public class 旋转链表练习 {
    /**
     * 解决思路
     * 1.如果k比链表长度还长，那就取余一下
     * 2.然后找到新的头节点的位置。
     * 3.将旧的头节点接到尾部
     *
     * @param head
     * @param k
     * @return
     */
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        int size = 0;
        ListNode tail = null;
        ListNode newHead;
        ListNode newTail = null;
        ListNode p = head;
        while (p != null) {
            size++;
            if (p.next == null) {
                tail = p;
            }
            p = p.next;
        }
        if (k % size == 0 || k % size == size) {
            return head;
        }
        k = size - (k % size);

        p = head;
        for (int i = 0; i < k; i++) {
            newTail = p;
            p = p.next;
        }
        newHead = p;
        newTail.next=null;
        tail.next = head;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode listNode = LinkedListUtil.buildListByArray(new int[]{1, 2, 3, 4,5});
        ListNode listNode1 = rotateRight(listNode, 0);
        LinkedListUtil.printList(listNode1);
    }
}
