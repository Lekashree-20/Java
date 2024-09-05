package LogicBuilding.Day4;

import java.util.Scanner;

public class SecondLastDigit {
    public static int secondLast(int input){
        if(input<0){
            input=input*(-1);
        }
        int count=0,rem=0;
        int len=Integer.toString(input).length();
        if(len==1){
            return -1;
        }
        else{
            while(input>0){
                rem=input%10;
                count++;
                input/=10;
                if(count==2){
                    break;
                }
            }
            return rem;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int sd=secondLast(input);
        System.out.println(sd);
        sc.close();
    }
}
