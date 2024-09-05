package LogicBuilding.Day10;
import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        String n=input1.toLowerCase();
        String word="";
        int i;
        for(i=n.length()-1;i>=0;i--){
            word=word+(n.charAt(i));
        }
        if(n.equals(word)){
            System.out.println("Palindrome");
        }
        else{
        System.out.println("Not a Palindrome");
        }
        sc.close();
    }
    
}
