package LogicBuilding.Day7;

import java.util.Scanner;
public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int i,j;
        int c=0;
        
        boolean prime=true;
        for(i=s1;i<=s2;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    prime=false;
                    break;
                }
                else{
                    prime=true;
                }
            }
            if(prime){
                // System.out.println("Prime numbers between given range are");

                // System.out.println(i);
                c++;
            }
        }
        System.out.println("\nCount of prime numbers between given range of" + s1 + "and" +  s2 + "is" + c);
        sc.close();
    }
}
