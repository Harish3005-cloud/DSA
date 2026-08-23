package listOperations;

public class linkedlist {
        Node head;
        class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                next=null;
            }
        }
        void addFirst(int data){
            Node newNode= new  Node(data);
            if(head ==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
        void printList(){
            if(head==null){
                System.out.println("The List is Empty : ");
                return;
            }
            Node curr=head;
            while(curr.next!=null){
                System.out.print(curr.data +" -> ");
                curr=curr.next;
            }
            System.out.println("NULL");

        }
        void deleteFirst(){
            if(head==null){
                System.out.println("The List is empty");
                return ;
            }
            head=head.next;
            
        }
        void deleteLast(){
            if(head==null){
                System.out.println("The List is empty");
                return ;
            }
            if(head.next==null){
                head=null;
                return;

            }
            Node secondLast=head;
            Node Last=head.next;
            while(Last.next!=null){
                secondLast=secondLast.next;
                Last=Last.next;

            }
            secondLast.next=null;
        }
        public static void main (String[]args){
            linkedlist list=new linkedlist();
            list.addFirst(10);
            list.addFirst(20);
            list.addFirst(30);
             list.addFirst(40);
             list.addFirst(50);
             list.addLast(100);
             list.printList();

    
    }
}
