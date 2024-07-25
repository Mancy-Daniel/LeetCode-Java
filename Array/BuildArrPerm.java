import java.util.Scanner;

/*
Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows: 
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3] */
public class BuildArrPerm {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // Check if nums[i] is within the valid range
            if (nums[i] < 0 || nums[i] >= nums.length) {
                throw new IllegalArgumentException("Array element out of bounds: " + nums[i]);
            }
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array length
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();

        // Input array elements
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Creating an instance of Solution and building the array
        BuildArrPerm solution = new BuildArrPerm();
        int[] ans = solution.buildArray(nums);

        // Printing the result
        System.out.print("Output: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
        sc.close();
    }
}
