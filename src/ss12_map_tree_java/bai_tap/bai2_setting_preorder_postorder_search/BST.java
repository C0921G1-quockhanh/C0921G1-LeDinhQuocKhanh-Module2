package ss12_map_tree_java.bai_tap.bai2_setting_preorder_postorder_search;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {}

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }

    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e);
        else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;

            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false;
            }

            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else if (e.compareTo(parent.element) > 0)
                parent.right = createNewNode(e);
            else
                return false;
        }

        size++;
        return true;
    }

    public TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean search(E e) {
        TreeNode<E> current = root;

        while (current != null) {
            if (e.compareTo(current.element) < 0)
                current = current.left;
            else if (e.compareTo(current.element) > 0)
                current = current.right;
            else
                return true;
        }

        return false;
    }

    @Override
    public void postOrder() {
        postOrder(root);
    }

    protected void postOrder(TreeNode<E> root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.element + " ");
    }

    @Override
    public void preOrder() {
        preOrder(root);
    }

    protected void preOrder(TreeNode<E> root) {
        if (root == null)
            return;
        System.out.print(root.element + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
