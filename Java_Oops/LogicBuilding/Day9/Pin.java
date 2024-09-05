package LogicBuilding.Day9;

import java.util.Scanner;

public class Pin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();//123
        int n2=sc.nextInt();//456
        int n3=sc.nextInt();//789
        int t1,t2,t3;
        int min=0;
        int max=0;
        int result=0;

        while(n1!=0 && n2!=0 && n3!=0){
            if(n1>n2 && n1>n3){
                max=n1;
            }
            else if(n2>n1 && n2>n3){
                max=n2;
            }
            else{
                max=n3;
            }
            
        int largestDig=0;
        while(max!=0){
            int d=max%10;
            if(d>largestDig){
                largestDig=d;
            }
            max/=10;
        }
    
        System.out.print(largestDig);
        break;
    }
        while(n1!=0 && n2!=0 && n3!=0){
            t1=n1%10;//3
            t2=n2%10;//6
            t3=n3%10;//9
            if(t1<t2 && t1<t3){
                min=t1;
            }
            
            else if(t2<t1 && t2<t3){
                min=t2;
            }
            else{
                min=t3;   
            }
            n1/=10;
            n2/=10;
            n3/=10;
            result = (result * 10) + min;
        }
        int val=result;
        int pal=0;
        while(val!=0){
            int t=val%10;
            pal=(pal*10)+t;
            val/=10;
        }
        System.out.println(pal);
        
        sc.close();
    }
}