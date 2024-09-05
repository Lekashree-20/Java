package LogicBuilding.Day4;

import java.util.Scanner;

public class SumOfLastTwoDigit {
    public static int sumTwo(int input1,int input2){
        if(input1 <0 ){
            input1=input1*(-1);
        }
        if(input2 <0){
            input2=input2*(-1);
        }
        int r1=0,r2=0,sum=0;
        r1=input1%10;
        r2=input2%10;
        sum=r1+r2;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int sd=sumTwo(input1,input2);
        System.out.println(sd);
        sc.close();
    }
}
