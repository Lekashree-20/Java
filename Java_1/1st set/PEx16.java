package Day2;
//nop
public class PEx16 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        //op:{1,3,5,2,4}
        int n=a.length;
        int temp;
        for(int i=0;i<n;i++){
            if(a[i]%2!=0 && i!=0){
                temp=a[i];
            
            for(int j=0;j<n;j++){
                if(a[j]%2==0){
                    for(int k=i;k>j;k--){
                        a[k]=a[k-1];
                    }
                    a[j]=temp;
                    break;
                }
            }
            
        }
    }
    }
}
