package Day5;

import java.util.Arrays;
public class Q2 {
    public static  void sort(char[] a1,char[] a2,int n1,int n2) {
        char temp;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n1-i-1;j++){
                if(a1[j]>a1[j+1]){
                    temp=a1[j];
                    a1[j]=a1[j+1];
                    a1[j+1]=temp;
                }
            }
        }
        System.out.println(new String(a1));
        char temp2;
        for(int i=0;i<n2;i++){
            for(int j=0;j<n2-i-1;j++){
                if(a2[j]>a2[j+1]){
                    temp2=a2[j];
                    a2[j]=a2[j+1];
                    a2[j+1]=temp2;
                }
            }
        }
        System.out.println(new String(a2));
        

    }
    public static boolean anagram(char[] a1,char[] a2,int n1,int n2) {
        if(n1!=n2){
            return false;
        }
        sort(a1,a2,n1,n2);

        for (int i = 0; i < n1; i++)
            if (a1[i] != a2[i])
                return false;
 
        return true;
    }
    public static void main(String[] args) {
    
    String str1="tea";
    String str2="ate";
    char a1[]=str1.toCharArray();
    char a2[]=str2.toCharArray();
    int n1=a1.length;
    int n2=a2.length;
    if(anagram(a1,a2,n1,n2)){
        System.out.println("Anagram");
    }
    else{
        System.out.println("Not an Anagram");
    }
    }
}


/* public class Q2 {
    public static boolean anagram(char[] str1,char[] str2,int n1,int n2) {
        if(n1!=n2){
            return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;
 
        return true;

    }
    public static void main(String[] args) {
    
    char str1[] = { 'e', 'a', 't' };
    char str2[] = { 'a', 't', 'e' };
    int n1=str1.length;
    int n2=str2.length;
    if(anagram(str1,str2,n1,n2)){
        System.out.println("Anagram");
    }
    else{
        System.out.println("Not an Anagram");
    }
    }
}
 */