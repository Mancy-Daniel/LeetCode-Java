import java.util.Scanner;

/*
 * Example 1:
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

Example 2:
Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]
 */
class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                ans[i] = nums[i / 2];
            } else {
                ans[i] = nums[n + i / 2];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of n (number of pairs):");
        int n = scanner.nextInt();

        int[] nums = new int[2 * n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = scanner.nextInt();
        }

        ShuffleArray solution = new ShuffleArray();
        int[] result = solution.shuffle(nums, n);

        System.out.println("Shuffled array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
