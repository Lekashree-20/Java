package Oops.String;

public class S6 {
    
    public static void main(String[] args) {
        String w1="Hiiiiii";
        String w2="Hello";
        String w3="";
        int n1=w1.length();
        int n2=w2.length();
        if(n1<n2){
            w3=w3+w1+w2+w1;
        }
        System.out.println(w3);
        if(n2<n1){
            w3=w3+w2+w1+w2;
        }
        System.out.println(w3);
    }
    }
    

