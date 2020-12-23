package entity;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/6/18
 */
public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}