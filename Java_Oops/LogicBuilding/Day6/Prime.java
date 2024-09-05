package LogicBuilding.Day6;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        
        if(n==0||n==1){  
            System.out.println(n+" is not prime number"); 
            return;
        }
        boolean prime=false;
        if(n>1){
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                prime=true;
                break;
            }
            }
        } 
        if(prime){
            System.out.println("Not a Prime number");
        }
        else{
            System.out.println("Prime number");
        }
    
        sc.close();
    
    }
    
}
