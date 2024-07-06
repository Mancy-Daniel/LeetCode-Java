import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 350. Intersection Of Two Arrays II
/*Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted. */
class IntersectionOfArray {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> nums3 = new ArrayList<Integer>();
        // int[] ans = new int[nums1.length];
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                nums3.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] ans = new int[nums3.size()];
        for (int k = 0; k < nums3.size(); k++) {
            ans[k] = nums3.get(k);
        }

        return ans;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] nums1 = new int[6];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = sc.nextInt();
        }
        int[] nums2 = new int[6];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = sc.nextInt();
        }
        System.out.println(intersect(nums1, nums2));
        sc.close();
    }
}
