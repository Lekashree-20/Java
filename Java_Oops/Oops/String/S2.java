package Oops.String;

public class S2 {
    public static void main(String[] args) {
        // Example strings to concatenate
        String str1 = "Hello";
        String str2 = "World";

        // Concatenate the strings and convert the result to lowercase
        String result = concatenateAndLowercase(str1, str2);

        // Print the result
        System.out.println("Concatenated and lowercase result: " + result);
    }

    public static String concatenateAndLowercase(String s1, String s2) {
        // Concatenate the strings and convert to lowercase
        return (s1 + s2).toLowerCase();
    }
}
