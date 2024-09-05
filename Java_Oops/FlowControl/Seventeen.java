package FlowControl;

import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pal=0;
        int temp=n;
        while(n!=0){
            int r=n%10;
            pal=(pal*10)+r;
            n=n/10;
        }
        
        if(temp==pal){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        
            
        }
}
