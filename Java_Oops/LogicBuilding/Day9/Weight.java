package LogicBuilding.Day9;

import java.util.Scanner;

public class Weight {
    public static int totalweight(int input1,int input2,int input3) {
        int i,j;
        int sum=0;
        for(i=0;i<input1;i++)
        {
            for(j=0;j<=i;j++)
            {
                sum+=input2;
            }
            input2+=input3;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int input3=sc.nextInt();
        int res=totalweight(input1,input2,input3);
        System.out.println(res);
        sc.close();
    }
}
