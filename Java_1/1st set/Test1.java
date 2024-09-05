package Day2;

public class Test1 {
    public static void main(String[] args) {
        String[] s={"Red","Black","Red","Black","Red"};
        int  n=s.length;
        int countr=0;
        int countb=0;
        for(int i=0;i<n;i++){
            if(s[i]=="Red"){
                countr=countr+1;
            }
            else{
                countb=countb+1;
            }
        }
        if(countr==countb){
            System.out.println("Peaceful");
        }
        else{
            System.out.println("Not Peaceful");
        }
    }
}
