package Array;

public class A4 {
    public static void main(String[] args){
        System.out.println("Ascii number to character");
        int[] asciiVal={65,66,67,68};
        for(int val:asciiVal){
            System.out.print((char)val+" ");
        }
        System.out.println(" \n Character to Ascii number ");
        char c='A';
        int ascii=c;
        System.out.print(ascii);
 }
}
