import java.util.Scanner;

public class LinkedList{
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    Node head=null;

    public void add_first(int val){
        Node new_node=new Node(val);
        new_node.next=head;
        head=new_node;
    }
    public void display1(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void add_index(int index,int val){
        Node newnode=new Node(val);
        if(index==0){
            add_first(val);
        }
        else{
            if(index<0){
                return; 
            }
            Node temp=head;
            while(index>1 && temp.next!=null){
                temp=temp.next;
                index--;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }

    public void add_last(int value){
        Node newnNode=new Node(value);
        if(head==null){
            head=newnNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnNode;
        }
    }

    public void delete_first(){
        head=head.next;
    }

    public void delete_last(){
        if(head!=null){
            if(head.next==null){
                delete_first();
            }
            else{
                Node temp=head;
                while(temp!=null && temp.next.next!=null){
                    temp=temp.next;
                }
                temp.next=null;

            }
        }
    }

    public void delete_index(int index){
        if(head!=null && index!=0){
            if(index==0){
                delete_first();
            }
            else{
                Node temp=head;
                while(index>1 && temp.next!=null){
                    index--;
                    temp=temp.next;
                }
                if(temp.next!=null){
                    temp.next=temp.next.next;
                }
            }
        }
    }


    public class Main{
        public static void main(String[] args) {
        LinkedList li=new LinkedList();
        Scanner sc=new Scanner(System.in);
        int k=0;
        System.out.println("Linked list for insertion at first place :");
        while(true){
            k=sc.nextInt();
            if(k==-1){
                break;

            }
            li.add_first(k);
        }
        System.out.println("After insertion at first place :");
        li.display1();

        
        System.out.println("Linked list for insertion at particular index :");
        System.out.println("Index value:");
        int index=sc.nextInt();
        System.out.println("Value:");
        int val=sc.nextInt();
        li.add_index(index,val);
        
        System.out.println("Linked list after insertion:");
        li.display1();
        

        System.out.println("Value to be inserted at last:");
        int value=sc.nextInt();
        li.add_last(value);
        System.out.println("Linked list after insertion at last:");
        li.display1();

        System.out.println("Deletion at first:");
        li.delete_first();
        li.display1();

        System.out.println("Deletion at last:");
        li.delete_last();
        li.display1();

        System.out.println("Deletion at index:");
        int indexdel=sc.nextInt();
        li.delete_index(indexdel);
        li.display1();

        sc.close();
        }
        
    }
}