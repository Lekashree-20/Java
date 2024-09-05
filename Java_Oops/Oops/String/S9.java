package Oops.String;

public class S9 {
    
    public static void main(String[] args) {
        String w1="Hello";
        String w2="World";
        String w3="";
        int n1=w1.length();
        int n2=w2.length();
        int min;
        if(n1<n2){
            min=n1;
        }
        else{
            min=n2;
        }
        for(int i=0;i<min;i++){
            w3=w3+(w1.charAt(i));
            w3=w3+(w2.charAt(i));
        }
        if(n1>min){
            for(int i=min;i<n1;i++){
                w3=w3+(w1.charAt(i));
            }
        }
        if(n2>min){
            for(int i=min;i<n2;i++){
                w3=w3+(w2.charAt(i));
            }
        }
        System.out.println(w3);
        
    }
}
    

