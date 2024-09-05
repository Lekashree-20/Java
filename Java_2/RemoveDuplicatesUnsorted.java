//Remove duplicates in Unsorted list

import java.util.Scanner;

public class RemoveDuplicatesUnsorted {
    class Node{
        Node next;
        int data;
        Node(int val){
            data=val;
            next=null;
        }
    }  
    Node head=null;
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void remove(){

        Node i=head;
        Node j=head;

       
        while(i!=null){
            while(j!=null && j.next!=null){
                if(i.data==j.next.data){
                    j.next=j.next.next;
                }
                else{
                    j=j.next;
                }
            }
            i=i.next;
            j=i;
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
        RemoveDuplicatesUnsorted r1=new RemoveDuplicatesUnsorted();
        
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
