//Remove duplicates in sorted list

import java.util.Scanner;

public class RemoveDuplicates {
    class Node {
        int data;
        Node next;
        Node(int val) {
            data = val;
            next = null;
        }
    }
    
    Node head = null;

    public void add(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            
        }
    }
    public void remove(){
        
        Node temp=head;
        while(temp!=null && temp.next!=null)
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
    

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        RemoveDuplicates r1=new RemoveDuplicates();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter values to be inserted (enter -1 to stop):");
        
        while (true) {
            int val = sc.nextInt();
            if (val == -1) {
                break;
            }
            r1.add(val);
        }

        System.out.println("After removing duplicates:");
        r1.remove();
        r1.display();

        sc.close();
        
    }
}
