package FlowControl;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String temp=a;
        a=b;
        b=temp;
        System.out.println(a+","+b);
       
    }
}
