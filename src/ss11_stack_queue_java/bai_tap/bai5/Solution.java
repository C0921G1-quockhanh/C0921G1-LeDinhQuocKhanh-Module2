package ss11_stack_queue_java.bai_tap.bai5;

public class Solution {
    static class Node {
        private int data;
        private Node next;
    }

    static class Queue {
        private Node front;
        private Node rear;
    }

    public static void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;

        if (q.front == null) {
            q.front = temp;
        }
        else {
            q.rear.next = temp;
        }

        q.rear = temp;
        q.rear.next = q.front;
    }

    public static int deQueue(Queue q) {
        if (q.front == null) {
            System.out.println("Queue is empty!");
            return Integer.MIN_VALUE;
        }

        int value;

        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        }
        else {
            Node temp = q.front;
            q.front = q.front.next;
            q.rear.next = q.front;
            value = temp.data;
        }

        return value;
    }

    public static void displayQueue(Queue q) {
        Node temp = q.front;

        System.out.println("Elements in Circular Queue are: ");

        while (temp.next != q.front) {
            System.out.printf("%d\t",temp.data);
            temp = temp.next;
        }

        System.out.printf("%d\t",temp.data);
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = null;
        q.rear = null;

        enQueue(q,14);
        enQueue(q,22);
        enQueue(q,-6);

        displayQueue(q);

        System.out.println();
        System.out.println(deQueue(q));
        System.out.println(deQueue(q));

        displayQueue(q);

        enQueue(q,9);
        enQueue(q,20);

        System.out.println();
        displayQueue(q);

    }
}
