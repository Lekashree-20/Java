package Oops.Class;

public class C2 {
    public static int intPow(int n1,int n2){
        return (int)Math.pow(n1,n2);
    }
    public static int powerDouble(double n1,int n2){
        return (int)Math.pow(n1,n2);
    }
    public static void main(String[] args) {
        int a=C2.intPow(9, 3);
        System.out.println(a);
        int b=C2.powerDouble(9, 3);
        System.out.println(b);

    }
}
