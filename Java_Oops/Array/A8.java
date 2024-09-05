package Array;

public class A8 {
    public static void main(String[] args) {
    int n=5;
    int[] a={7,1,2,3,6};
    int i,j;
    int p=-1;
    int q=-1;
    int sum=0;
    for(i=0;i<n-1;i++){
        for(j=i+1;j<n;j++){
            if(a[i]==6 && a[j]==7){
                System.out.println(i+" "+j);
                p=i;
                q=j;
                break;
        }
    }
    }
    if(p!=-1 && q!=-1){
        for(i=0;i<p;i++){
            sum+=a[i];
        }
        for(i=q+1;i<n;i++){
            sum+=a[i];
        }
        }
    else{
        for(i=0;i<n;i++){
            sum+=a[i];
        }
    }
    System.out.println(sum);
}
}
   