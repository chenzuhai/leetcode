package 数据结构;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/10/24
 */
public class RBTree<T extends Comparable<T>> {

    private RBTNode<T> mRoot; //根节点
    private static final boolean RED = false;
    private static final boolean BLACK = true;

    public class RBTNode<T extends Comparable<T>> {
        boolean color;
        T key;
        RBTNode<T> left;
        RBTNode<T> right;
        RBTNode<T> parent;

        public RBTNode(T key, boolean color, RBTNode<T> parent, RBTNode<T> left, RBTNode<T> right) {
            this.color = color;
            this.key = key;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }
    }

    /*
     *   左旋操作
     */
    private void leftRotate(RBTNode<T> x) {
        RBTNode<T> y = x.left;  //取出右孩子

        x.right = y.left;

        if (y.left != null) {
            y.left.parent = x;
        }

        y.parent = x.parent;

        if (x.parent == null) {
            this.mRoot = y; //如果x没有父节点，说明要将y作为新的根节点
        } else {
            if (x.parent.left == x) {   //如果x是父节点的左孩子
                x.parent.left = y;  //那么将x的父节点的左孩子设置为y
            } else {
                x.parent.right = y;
            }
        }
        y.left = x;
        x.parent = y;
    }

    /*
     *   右旋操作
     */
    private void rightRotate(RBTNode<T> y) {
        RBTNode<T> x = y.left; //取出左孩子

        y.left = x.right;
        if (x.right != null) {
            x.right.parent = y;
        }

        x.parent = y.parent;

        if (y.parent == null) {
            this.mRoot = x;
        } else {
            if (y.parent.left == y) {
                y.parent.left = x;
            } else {
                y.parent.right = x;
            }
        }
        x.right = y;
        y.parent = x;
    }

    /*
     * 插入
     */
    public void insert(T key) {
        RBTNode<T> node = new RBTNode<>(key, BLACK, null, null, null);
        if (node != null) {
            insert(node);
        }
    }

    public void insert(RBTNode<T> node) {
        int cmp;
        RBTNode<T> y = null;
        RBTNode<T> x = this.mRoot;

        while(x!=null){
            y = x;
            cmp = node.key.compareTo(x.key);
            if(cmp<0){
                x = x.left;
            }else{
                x = x.right;
            }
        }

        node.parent = y;

        if(y!=null){
            cmp = node.key.compareTo(y.key);
            if (cmp < 0)
                y.left = node;
            else
                y.right = node;
        }else{ //y是空的
            //此节点为跟接待你
            this.mRoot = node;
        }
        node.color = RED;

        insertFixUp(node); //修正红黑树函数
    }
    public boolean isRed(RBTNode<T> node){
        if(node==null)return false;
        return node.color==RED;
    }
    private void insertFixUp(RBTNode<T> node) {

    }


}
