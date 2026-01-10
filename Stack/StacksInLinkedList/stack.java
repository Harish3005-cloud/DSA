package Stack.StacksInLinkedList;

import java.util.*;

public class stack {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node Newnode = new Node(data);
            if (isEmpty()) {
                head = Newnode;
                return;

            }
            Newnode.next = head;
            head = Newnode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int Top = head.data;
            head = head.next;
            return Top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
