package LogicBuilding.Day9;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[10];  // Initialize the array with size 10
        int rem = 0;

        // Count the frequency of each digit
        //int originalNumber = n;
        while (n > 0) {
            rem = n % 10;
            a[rem]+=1;
            n /= 10;
        }

        int odd = 0;

        // Check the frequency array for odd counts
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 != 0) {
                odd++;
            }
            if (odd > 1) {
                System.out.println("1");
                sc.close();
                return;
            }
        }

        System.out.println("2");
        sc.close();
    }
}
