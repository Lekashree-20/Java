package Day5;

import java.util.Scanner;

/* import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class WordContinuation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        // Prompt the user to enter the first word
        System.out.print("Enter the first word: ");
        String firstWord = scanner.nextLine();
        words.add(firstWord);

        // Continue adding words until the condition is no longer satisfied
        while (true) {
            System.out.print("Enter the next word or type 'quit' to exit: ");
            String nextWord = scanner.nextLine();

            // Check if the next word starts with the ending letter of the previous word
            if (nextWord.toLowerCase().startsWith(words.get(words.size() - 1).toLowerCase().substring(words.get(words.size() - 1).length() - 1))) {
                words.add(nextWord);
            } else {
                break;
            }
        }

        // Print the sequence of words
        System.out.println("Sequence of words satisfying the condition:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
 */
public class Q5 {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        String w1=sc.next();
        String w2=sc.next();
        int n=w1.length();
        System.out.println(w1);
        while (w2.charAt(0)==w1.charAt(n-1)) {
            System.out.println(w2);
            w1=w2;
            w2=sc.next();
            n=w1.length();
        }
        
    }
}