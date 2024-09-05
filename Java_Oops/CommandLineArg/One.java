package CommandLineArg;

public class One {
    
        public static void main(String[] args) {
            if (args.length >= 2) {
                System.out.println(args[0]+ "Technologies" +args[1]);
            } else {
                System.out.println("Pls provide value");
            }
    
            
        }
    
}
//javac CommandLineArg/One.java    ---->give it in terminal
//java CommandLineArg.One Wipro Banglore