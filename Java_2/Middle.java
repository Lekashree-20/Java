import java.util.Scanner;

public class Middle {
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    Node head=null;

    public void add(int val){
        Node newNode1=new Node(val);
        Node temp=head;
        if(head==null){
            head=newNode1;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode1;
        }
    }

    public void middle(int value){
        Node newNode1=new Node(value);
        if(head==null){
            head=newNode1;
        }
        else{
            Node fast=head;
            Node slow=head;
            while(fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            newNode1.next=slow.next;
            slow.next=newNode1;
        }

    }
    
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }

    
        public static void main(String[] args) {
            Middle m=new Middle();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the vlues to be inserted:");
            while(true){
                int val=sc.nextInt();
                if(val==-1){
                    break;
                }
                m.add(val);
            }
            System.out.println("After values are inserted");
            m.display();;

            System.out.println("Enter the value to be added at the middle:");
            int value=sc.nextInt();
            m.middle(value);
            System.out.println("After added the value at the middle:");
            m.display();

            sc.close();
        }
    }

