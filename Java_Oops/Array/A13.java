package Array;

public class A13 {
    public static void main(String[] args){
        int[][] a=new int[2][2];
        int i,j;
        a[0][0]=Integer.parseInt(args[0]);
        a[0][1]=Integer.parseInt(args[1]);
        a[1][0]=Integer.parseInt(args[2]);
        a[1][1]=Integer.parseInt(args[3]);
        System.out.println("Print Array:");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Reversed Array");
        int[][] rev=new int [2][2];
        rev[0][0]=a[1][1];
        rev[0][1]=a[1][0];
        rev[1][0]=a[0][1];
        rev[1][1]=a[0][0];
        System.out.println("Print Rev Array:");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(rev[i][j] + " ");
            }
            System.out.println();
        }
     }
}
