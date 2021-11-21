package ss12_map_tree_java.bai_tap.bai2_setting_preorder_postorder_search;

public interface Tree<E> {
    public boolean insert(E e);

    public boolean search(E e);

    public int getSize();

    public void postOrder();

    public void preOrder();
}
