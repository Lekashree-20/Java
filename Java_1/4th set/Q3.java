package Day5;

public class Q3 {
    public static int decryption(String s,int n) {
        int sum=0;
        int num=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                num=num*10+(s.charAt(i)-'0');
            }
            else{
                sum+=num;
                num=0;
            }
        }
        sum+=num;
        return sum;

    }
    public static void main(String[] args) {
        String s="ab12cd12e";
        int n=s.length();
        int b=decryption(s,n);
        System.out.println(b);
    }
}
