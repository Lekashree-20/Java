package Oops.String;

public class S8 {
    public static void main(String[] args) {
        String w1 = "ab*cd";
        char[] result = new char[w1.length()];
        int index = 0;

        int n = w1.length();
        for (int i = 0; i < n; i++) {
            if (w1.charAt(i) == '*') {
                // Skip the character before '*'
                if (index > 0) {
                    index--; // Move back to overwrite the last added character
                }
                // Skip the next character
                i++;
            } else {
                // Add current character to result
                result[index] = w1.charAt(i);
                index++;
            }
        }

        // Convert result char array to string by traversing till the index
        String finalResult = "";
        for (int i = 0; i < index; i++) {
            finalResult += result[i];
        }

        System.out.println(finalResult);
    }
}
