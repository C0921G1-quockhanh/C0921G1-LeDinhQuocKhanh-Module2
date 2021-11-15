package ss10_list_java.bai_tap.bai2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(20);

        //Check Method addLast()
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.addLast(50);
        linkedList.addLast(60);

        //Check Method addFirst()
        linkedList.addFirst(10);

        //Check Method add()
        linkedList.add(2,25);

        //Check Method remove()
        linkedList.remove(2);

        //Check Method removeFirst()
        linkedList.removeFirst();

        //Check Method removeLast()
        linkedList.removeLast();

        //Check Method contains()
        boolean check = linkedList.contains(40);
        if (check)
            System.out.println("True!");
        else
            System.out.println("False!");

        boolean check1 = linkedList.contains(70);
        if (check1)
            System.out.println("True!");
        else
            System.out.println("False!");

        //Check Method get()
        System.out.println("Node at index 0 " + linkedList.get(0));
        System.out.println("Node at index 1 " + linkedList.get(1));
        System.out.println("Node at index 2 " + linkedList.get(2));

        //Check Method getFirst()
        System.out.println("First node is " + linkedList.getFirst());

        //Check Method getLast()
        System.out.println("Last node is " + linkedList.getLast());

        linkedList.printList();
    }
}
