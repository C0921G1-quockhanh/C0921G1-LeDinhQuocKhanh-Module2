package ss12_map_tree_java.bai_tap.bai2_setting_preorder_postorder_search;

import java.util.Scanner;

public class TestBST {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();

        tree.insert(60);
        tree.insert(55);
        tree.insert(100);
        tree.insert(45);
        tree.insert(57);
        tree.insert(67);
        tree.insert(107);
        tree.insert(59);
        tree.insert(101);

        System.out.println("The size of tree is " + tree.getSize());

        //Check search()
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to search: ");
        int number = sc.nextInt();

        if (tree.search(number)) {
            System.out.println("This number is in the tree!");
        } else {
            System.out.println("This number is not in the tree!");
        }

        //Check postOrder()
        System.out.println("Post-Order sorted: ");
        tree.postOrder();

        //Check preOrder()
        System.out.println("\nPre-Order sorted: ");
        tree.preOrder();
    }
}
