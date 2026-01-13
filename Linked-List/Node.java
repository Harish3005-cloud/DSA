import java.util.*;

public class Node {
    int data;
    Node next;
    int head;
    private int size=0;

    public Node(int data) {
        this.data = data;
        next = null;
        size++;

    }

    static void traverslist(Node head) {
        if (head == null) {
            System.out.println();
            return;
        }
        System.out.print(head.data);
        if (head.next != null) {
            System.out.print(" -> ");
        }
        traverslist(head.next);
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        traverslist(head);
        getSize();

    }
}
