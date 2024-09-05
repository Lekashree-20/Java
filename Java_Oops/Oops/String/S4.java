package Oops.String;

public class S4 {
    
    public static void main(String[] args) {
        String w1="TomCat";
        String w2="";
        int n=w1.length();
        int l=0;
        int e=n-1;
        int mid=(l+e)/2;
        if(n%2==0){
            for(int i=0;i<=mid;i++){
                w2=w2+(w1.charAt(i));
            }
        }
        System.out.println(w2);
         if(n%2!=0){
             System.out.println("Null");
         }
    }
    }
    
