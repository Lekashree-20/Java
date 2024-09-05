package Array;

public class A14 {
    public static void main(String[] args){
        int[][] a=new int[3][3];
        int i,j;
        if(args.length!=9){
            System.out.println("Provide 9 numbers");
        }
        else{
        a[0][0]=Integer.parseInt(args[0]);
        a[0][1]=Integer.parseInt(args[1]);
        a[0][2]=Integer.parseInt(args[2]);
        a[1][0]=Integer.parseInt(args[3]);
        a[1][1]=Integer.parseInt(args[4]);
        a[1][2]=Integer.parseInt(args[5]);
        a[2][0]=Integer.parseInt(args[6]);
        a[2][1]=Integer.parseInt(args[7]);
        a[2][2]=Integer.parseInt(args[8]);
        System.out.println("Print Array:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    
        
        int max=a[0][0];
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(a[i][j]>max){
                    max=a[i][j];
                }
            }
        }
        System.out.println("Largest number in an array :"+max);
     }
    }
}
