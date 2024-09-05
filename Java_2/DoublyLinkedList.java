import java.util.Scanner;

public class DoublyLinkedList {
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int val){
            data=val;
            next=null;
            prev=null;
        }
    }
    Node head=null;
    Node tail=null;

    void add_first(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail = newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }

    void add_last(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }

    void add_index(int index,int value){
        //Node newNode=new Node(value);
        if(index==0){
            add_first(value);
        }
        else{
            Node temp=head;
            while(index>1 && temp.next!=null){
                index--;
                temp=temp.next;
            } 
            Node newNode=new Node(value);
            newNode.next =temp.next;
            temp.next.prev=newNode;
            temp.next=newNode;
            newNode.prev=temp;
        }
    }

    void delete_first(){
        if(head!=null){
            if(head.next==head){
                head=null;
                tail=null;
            }
            else{
                head=head.next;
                head.prev.next=null;
                head.prev=null;
            }
        }
    }

    void delete_last(){
        if(head.next==null){
            head=null;
            tail=null;
        }
        else{
            tail=tail.prev;
            tail.next.prev=null;
            tail.next=null;
        }
    }

    void delete_index(int index){
        //Node newNode=new Node(value);
        if(index==0){
            delete_first();
        }
        else{
            Node temp=head;
            if(head!=null){
                while(index>1 && temp.next!=null){
                index--;
                temp=temp.next;
                }
                if(temp.next!=null){
                    temp.next.prev=null;
                    if(temp.next.next!=null){
                        temp.next.next.prev=temp;
                        temp.next=temp.next.next;
                    }
                    else{
                        temp.next=temp.next.next;
                        tail=temp;
                    }
                }
            }
        }
    }



    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
            System.out.println("Null");
    }

    public static void main(String[] args) {
        DoublyLinkedList li=new DoublyLinkedList();
        Scanner sc=new Scanner(System.in);
        int k=0;
        System.out.println("Doubly Linked list for insertion at first place :");
        while(true){
            k=sc.nextInt();
            if(k==-1){
                break;

            }
            li.add_first(k);
        }
        System.out.println("After insertion at first place :");
        li.display();

        System.out.println("Doubly Linked list for insertion at last place :");
        int val=sc.nextInt();
        li.add_last(val);
        System.out.println("Doubly Linked list after insertion at last place :");
        li.display();


        System.out.println("Doubly Linked list for inserting a specific index:");
        System.out.println("Enter specific index:");
        int index=sc.nextInt();
        System.out.println("Enter value:");
        int value=sc.nextInt();
        System.out.println("After inserting at index:");
        li.add_index(index,value);
        li.display();

        System.out.println("Circular Linked list for deletion at first place :");
        li.delete_first();
        li.display();

        System.out.println("Circular Linked list for deletion at last place :");
        li.delete_last();
        li.display();

        System.out.println("Circular Linked list for deleting a specific index:");
        System.out.println("Enter specific index:");
        int index1=sc.nextInt();
        System.out.println("After deleting at index:");
        li.delete_index(index1);
        li.display();

        sc.close();


    }
    }

