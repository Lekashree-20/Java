package FlowControl;

import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        if(n<=1){
            System.out.println("Its not a prime number");
        }
        else{
            boolean prime=true;
            for(i=2;i<n/2;i++){
                if(n%i==0){
                prime=false;
                break;
            }
        }
        if(prime){
           
                System.out.println(" Prime number");
            }
        else{
                System.out.println("Its not a prime number");
            }
        
        }
        
    }
    }
