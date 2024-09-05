package LogicBuilding.Day5;

import java.util.Scanner;

public class FiveOdd {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int n3=sc.nextInt();
    int n4=sc.nextInt();
    int n5=sc.nextInt();
    int count=0;
    if(n1%2!=0 ){
        count++;
    }
    if(n2%2!=0){
        count++;
    }
    if(n3%2!=0){
        count++;
    }
    if(n4%2!=0){
        count++;
    }
    if(n5%2!=0){
        count++;
    }
    System.out.println(count);
    sc.close();
}
}
