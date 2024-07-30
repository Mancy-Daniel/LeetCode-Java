import java.util.Scanner;

/*
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
 */
class EvenNumsDigits {
    public int findNumbers(int[] nums) {
        int digit = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 0;
            while (num > 0) {
                num = num / 10;
                count++;
            }
            if (count % 2 == 0) {
                digit++;
            }
        }
        return digit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        EvenNumsDigits solution = new EvenNumsDigits();
        int result = solution.findNumbers(nums);

        System.out.println("Number of elements with an even number of digits: " + result);
        scanner.close();
    }
}
