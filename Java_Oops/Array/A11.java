package Array;

import java.util.Scanner;

public class A11 {
    public static void oneFour(int a[],int n) {
        int i;
        int c1=0;
        int c4=0;
        int c=0;
        boolean val=false;
        for(i=0;i<n;i++){
            if(a[i]==1){
                c1+=1;
            }
            
            else if(a[i]==4){
                c4+=1;
            }
            
            else{
                c+=1;
            }
            
        }
        if(c!=0){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }
    
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i;
        for(i=0;i<n;i++){   //getting input from user
            a[i]=sc.nextInt();
        }
        oneFour(a,n);
    }
}
