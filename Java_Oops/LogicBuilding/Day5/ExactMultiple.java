package LogicBuilding.Day5;

import java.util.Scanner;

public class ExactMultiple {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    int input1=sc.nextInt();
    int input2=sc.nextInt();
    if(input1==0||input2==0){
        System.out.println("3");
    }
    if(input1%input2==0){
        System.out.println("2");
    }
    else{
        System.out.println("1");
    }
    
    sc.close();
}
}
