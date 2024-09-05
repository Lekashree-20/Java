//To check if the given linked list is circular linked list or not

import java.util.Scanner;

public class CheckCircular {
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

    boolean toCheck(){
        if(head==null){
            return true;
        }
        else{
            Node temp=head;
            while (temp.next!=head && temp.next!=null) {
                temp=temp.next;
            }
            return (temp.next==head)?true:false;
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
        CheckCircular li=new CheckCircular();
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

        System.out.println("To check given linked list is circular or not:");
        li.toCheck();

        sc.close();

        
    }
}
