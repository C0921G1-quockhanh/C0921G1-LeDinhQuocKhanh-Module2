package ss12_map_tree_java.thuc_hanh.bai4;

public interface Tree<E> {
    public boolean insert(E e);

    public void inorder();

    public int getSize();
}
