package Stack.StacksinArrays;

import java.util.*;

public class stack {
    static class Stack {
        static int size = 0;
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
            size++;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            size--;
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

        public static int getSize() {
            return size;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.getSize());
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());

    }

}