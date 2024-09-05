package Oops.String;

public class S10 {
    
    public static void main(String[] args) {
        String s="Wipro";
        String w3="";
        String w4="";
        int a=3;
       
        int n=s.length();
        int subVal=n-a;
        for(int i=subVal;i<n;i++){
            w3=w3+s.charAt(i);
        }
        System.out.println(w3);
        for(int i=0;i<a;i++){
            w4=w4+w3;
        }
        System.out.println(w4);
    }
    }
    

