package ss10_list_java.bai_tap.bai2;

public class MyLinkedList<E> {
    //Data fields - Constructor
    private int numNodes = 0;
    private Node head;

    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    //Methods
    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(element);
        numNodes++;
    }

    public E remove(int index) {
        Node temp = head;
        Node removeNode;

        for (int i = 0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }

        removeNode = temp.next;
        temp.next = temp.next.next;
        numNodes--;
        return (E) removeNode;
    }
    
    public E removeFirst() {
        Node removeNode = head;
        head = head.next;
        return (E) removeNode;
    }

    public E removeLast() {
        Node temp = head;
        Node removeNode;

        if (temp == null) {
            return null;
        }

        if (temp.next == null) {
            numNodes--;
            return (E) temp;
        }

        while (temp.next != null && temp.next.next != null) {
            temp = temp.next;
        }

        removeNode = temp.next.next;
        temp.next = null;
        return  (E) removeNode;
    }

    public boolean contains(E o) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == o) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public E get(int index) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp;
        return (E) holder.data;
    }

    public E getFirst() {
        Node temp = head;
        return (E) temp.data;
    }

    public E getLast() {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        return (E) temp.data;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
