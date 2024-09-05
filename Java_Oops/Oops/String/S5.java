package Oops.String;

public class S5 {
   
    public static void main(String[] args) {
        String w1="TomCat";
        String w2="";
        int n=w1.length();
        int i;
        for(i=1;i<n-1;i++){
            w2=w2+(w1.charAt(i));
        }
        System.out.println(w2);
    }
    }
    

