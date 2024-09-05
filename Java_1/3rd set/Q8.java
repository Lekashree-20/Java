package Day4;

public class Q8 {
    public static void uniformOrNot(int a[][],int n1,int n2) {
        int c1=0,c2=0;
        for(int i=0;i<n1;i++){
        for(int j=0;j<n2;j++){
            if(a[i][j]%2==0){
                c1=1;
            }
            else{
                c2=1;
            }
        }
        if(c1==c2){
            System.out.println("Not an Uniform matrix");
            return;
        }
       } 
       System.out.println("uniform matrix");
    }
    public static void main(String[] args) {
        int a[][]={{4,5},{5,4}};//output--not an uniform matrix
        //int a[][]={{3,5},{5,7}}; /output--uniform matrix
        int n1=a.length;
        int n2=a[0].length;
        uniformOrNot(a,n1,n2);
    }
    
}
