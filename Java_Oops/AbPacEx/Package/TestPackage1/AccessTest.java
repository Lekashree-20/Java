package AbPacEx.Package.TestPackage1;

public class AccessTest {
    public static void main(String[] args) {
        Foundation foundation = new Foundation();
        
        // System.out.println("var1: " + foundation.var1); // Error: var1 is private and cannot be accessed from outside its class
        // System.out.println("var2: " + foundation.var2); // Error: var2 has default access, so it cannot be accessed from a different package
        // System.out.println("var3: " + foundation.var3); // Error: var3 is protected and can be accessed if this class extends the Foundation class
        System.out.println("var4: " + foundation.var4); // This will work because var4 is public
    }
}
