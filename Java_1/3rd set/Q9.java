package Day4;

public class Q9 {
    public static void valIndex(int a[][],int k) {
        int i=(k-1)/3;
        int j=(k-1)%3;
        System.out.println(i+" "+j+" ");
    }
    public static void main(String[] args) {
        int a[][]={ {1,2,3},{4,5,6},{7,8,9}};
        int k=6; 
        valIndex(a,k);
    }
}
