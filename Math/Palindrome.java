import java.util.Scanner;

/*
 Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
 */
class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // Negative numbers are not palindromes
        }

        int a = x;
        int ans = 0;
        while (a > 0) {
            int rem = a % 10;
            ans = (ans * 10) + rem;
            a /= 10;
        }
        return ans == x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it is a palindrome:");
        int x = scanner.nextInt();

        Palindrome solution = new Palindrome();
        boolean result = solution.isPalindrome(x);

        if (result) {
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is not a palindrome.");
        }
        scanner.close();
    }
}
