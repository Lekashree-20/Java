package LogicBuilding.Day10;

import java.util.Scanner;

public class SecUpper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        String strArr[]=word.split(" ");
        String one="LESS";
        if(strArr.length<2){
            System.out.println(one);
        }
        String a=strArr[1].toUpperCase();
        System.out.println(a);
        sc.close();
    }
}
