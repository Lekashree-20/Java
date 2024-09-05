package CommandLineArg;

public class Three {
    public static void main(String[] args) {
        int i1=Integer.parseInt(args[0]);
        int i2=Integer.parseInt(args[1]);
        int sum=i1+i2;
        System.out.println("Sum of "+i1+"+"+i2+"is" +sum);
    }
}
