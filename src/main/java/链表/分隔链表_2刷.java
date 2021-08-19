package 链表;

import entity.ListNode;
import util.LinkedListUtil;

/**
 * @author Chen Zuhai
 * @Date 2021-06-30 17:00
 * @email: chenzuhai@induschain.cn
 */

/**
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 *
 * 你应当 保留 两个分区中每个节点的初始相对位置。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/partition-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 分隔链表_2刷 {
    /**
     *  solution1
     *  1.首先找到x对应的节点
     *  2.然后把这个节点取出来
     *  3.从头节点开始比较
     *  4.如果比这个节点小，那么无所谓，继续
     *  5.碰到一个比这个大的，那么x这个系欸但就放到这个节点前面，继续遍历后面的，如果比这个小，就取出来放到x前面就行了。
     */
    public static ListNode partition(ListNode head, int x){
        if(head==null||(head.next==null)){
            return head;
        }
        //保存目标节点的前一个
        ListNode p = head;
        ListNode q = head;
        ListNode middleNode = null;
        while(q!=null){
            if(q.val == x){
                //找打目标节点
                p.next = p.next.next;
                middleNode = q;
            }
            p = q;
            q = q.next;
        }
        p = head;
        q = head;
        ListNode middlePre;
        while(q!=null){
            if(q.val<x){
                p = q;
                q = q.next;
                continue;
            }else {
                //将这个节点插入
                middleNode.next = q;
                p.next = middleNode;
                //保存好中间之前的那个节点便于插入
                middlePre = p;
                q = q.next;
                while(q!=null){
                    if(q.val>x){
                        p = q;
                        q = q.next;
                        continue;
                    }else {
                        //说明这个节点需要被移动到前面
                        ListNode tmp = q;
                        p.next = q.next;
                        tmp.next = middlePre.next;
                        middlePre.next = tmp;
                        middlePre = middlePre.next;
                        p = q;
                        q = q.next;
                        continue;
                    }
                }
                if(q==null){
                    break;
                }
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = LinkedListUtil.buildListByArray(new int[]{1, 4, 3, 2, 5, 2});
        ListNode partition = partition(listNode, 3);
        LinkedListUtil.printList(partition);
    }
}
