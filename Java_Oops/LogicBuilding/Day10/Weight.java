package LogicBuilding.Day10;

import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        String n1=input1.toLowerCase();
        int n2=sc.nextInt();
        int i,j;
        int sum1=0;
        int sum2=0;
        for(i=0;i<n1.length();i++){
            j=(n1.charAt(i));
            if(j>96 && j<123){
                sum1=sum1+(j-96);
            }
            if(j==97||j==101||j==105||j==111||j==117){
                sum2=sum2+(j-96);
            }
            
        }
        if(n2==1){
            System.out.println(sum1);
        }
        else{
            System.out.println(sum1-sum2);
        }
        sc.close();
    }
}
