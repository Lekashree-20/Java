package ZohoSet1.FaceTraining;
class A{
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
};
static boolean detectLoop(Node head){
   
    Node slow=head;
    Node fast=head;

    while(fast.next!=null && fast!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return true;
        }
    return false;
}
}


    public static void main(String[] args) {
        
    Node n1=new Node(1);
    Node n2=new Node(2);
    n1.next = n2;
    Node n3=new Node(3);
    n2.next = n3;
    Node n4=new Node(4);
    n3.next = n4;
    Node n5=new Node(5);
    n4.next = n5;
    n5.next = n2;
    
    Node head=n1;

    boolean found=detectLoop(head);
    if (found){
        System.out.println("loop found");
    }
    else{
        System.out.println("loop found");
    }

}
}