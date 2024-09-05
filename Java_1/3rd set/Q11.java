package Day4;

public class Q11 {
    public static void spiralMatrix(int a[][],int r,int c) {
        int top=0;
        int bottom=r-1;
        int left=0;
        int right=c-1;
        while(bottom>= top && left<=right ){
            for(int i=left;i<=right;i++){
                System.out.print(a[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(a[i][right]+" ");

            }
            right--;
            for(int i=right;i>=left;i--){
                System.out.print(a[bottom][i]+" ");
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                System.out.print(a[i][left]+" ");
            }
            left++;
        }
    }
    public static void main(String[] args) {
    int a[][]={ {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
    int r=a.length;
    int c=a[0].length;
    spiralMatrix(a,r,c);
    }
}