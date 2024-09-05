import java.util.Scanner;

public class CircularLinkedList {
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    Node head=null;

    void add_first(int value){
        Node newNodes=new Node(value);
        if(head==null){
            head=newNodes;
            head.next=head;
        }
        else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newNodes;
            newNodes.next=head;
            head=newNodes;
        }
    }

    void add_last(int value){
        Node newNodes=new Node(value);
        if(head==null){
            head=newNodes;
            head.next=head;
        }
        else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newNodes;
            newNodes.next=head;
        }
    }

    void add_index(int index,int value){
        Node newNode=new Node(value);
        if(index==0){
            add_first(value);
        }
        else{
            Node temp=head;
            while(index>1 && temp.next!=head){
                temp=temp.next;
                index--;
            } 
            newNode.next=temp.next;
            temp.next=newNode;

        }
    }

    void delete_first(){
        if(head!=null){
            if(head.next==head){
                head=null;
            }
            else{
                head=head.next;
                Node temp=head;
                while(temp.next!=head && temp.next.next!=head){
                    temp=temp.next;
                }
                temp.next=head;
            }
        }

    }

    void delete_last(){
        if(head!=null){
            if(head.next==head){
                head=null;
            }
            else{
                Node temp=head;
                while(temp.next!=head && temp.next.next!=head){
                    temp=temp.next;
                }
                temp.next=head;
            }
        }
    }

    void delete_index(int index){
        
        if(index==0){
            delete_first();
        }
        else{
            Node temp=head;
            while(index>1 && temp.next!=head){
                temp=temp.next;
                index--;
            } 
            temp.next=temp.next.next;

        }
    }



    void display(){
        Node temp=head;
        if(head!=null){
            while(temp.next!=head){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }

    
        public static void main(String[] args) {
        CircularLinkedList li=new CircularLinkedList();
        Scanner sc=new Scanner(System.in);
        int k=0;
        System.out.println("Circular Linked list for insertion at first place :");
        while(true){
            k=sc.nextInt();
            if(k==-1){
                break;

            }
            li.add_first(k);
        }
        System.out.println("After insertion at first place :");
        li.display();

        System.out.println("Circular Linked list for insertion at last place :");
        int val=sc.nextInt();
        li.add_last(val);
        System.out.println("Circular Linked list after insertion at last place :");
        li.display();

        System.out.println("Circular Linked list for deletion at first place :");
        li.delete_first();
        li.display();

        System.out.println("Circular Linked list for deletion at last place :");
        li.delete_last();
        li.display();

        System.out.println("Circular Linked list for inserting a specific index:");
        System.out.println("Enter specific index:");
        int index=sc.nextInt();
        System.out.println("Enter value:");
        int value=sc.nextInt();
        System.out.println("After inserting at index:");
        li.add_index(index,value);
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



