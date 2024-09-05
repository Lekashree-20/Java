package Day5;

public class Q4 {
    public static char[] encryption(char[] a,int n) {
        for(int i=0;i<n-1;i=i+2){
            char temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        //System.out.println(a);
        return a;
    }
    public static void main(String[] args) { 
        String s="123456";
        char a[]=s.toCharArray();
        int n=a.length;
        char[] b=encryption(a,n);
        System.out.println(b);
        
    }
}
