import java.util.*;

// 1509. Minimun Difference Between Largest and Smallest Value in Three Moves
/*Input: nums = [1,5,0,10,14]
Output: 1
Explanation: We can make at most 3 moves.
In the first move, change 5 to 0. nums becomes [1,0,0,10,14].
In the second move, change 10 to 0. nums becomes [1,0,0,0,14].
In the third move, change 14 to 1. nums becomes [1,0,0,0,1].
After performing 3 moves, the difference between the minimum and maximum is 1-0 = 1.
It can be shown that there is no way to make the difference 0 in 3 moves. */
class Mindiffin3moves {
    public static int minDifference(int[] nums) {
        if (nums.length <= 4) {
            return 0;
        }
        Arrays.sort(nums);
        int window = nums.length - 4;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            if (nums[i + window] - nums[i] < min) {
                min = nums[i + window] - nums[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[6];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(minDifference(nums));
        sc.close();
    }
}