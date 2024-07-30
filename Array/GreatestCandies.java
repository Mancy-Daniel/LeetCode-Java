import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

Example 2:

Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true,false,false,false,false] 
Explanation: There is only 1 extra candy.
Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
 */
class GreatestCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of kids:");
        int n = scanner.nextInt();

        int[] candies = new int[n];
        System.out.println("Enter the number of candies each kid has:");
        for (int i = 0; i < n; i++) {
            candies[i] = scanner.nextInt();
        }

        System.out.println("Enter the number of extra candies:");
        int extraCandies = scanner.nextInt();

        GreatestCandies solution = new GreatestCandies();
        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);

        System.out.println("Result:");
        for (boolean b : result) {
            System.out.print(b + " ");
        }
        scanner.close();
    }
}
