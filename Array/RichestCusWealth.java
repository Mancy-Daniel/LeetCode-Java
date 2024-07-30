import java.util.Scanner;

/*
Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.

Example 2:

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
 */
class RichestCusWealth {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        int max = 0;
        for (int row = 0; row < accounts.length; row++) {
            ans = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                ans += accounts[row][col];
            }
            if (ans > max) {
                max = ans;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of customers:");
        int m = scanner.nextInt();

        System.out.println("Enter the number of banks:");
        int n = scanner.nextInt();

        int[][] accounts = new int[m][n];
        System.out.println("Enter the wealth for each customer at each bank:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                accounts[i][j] = scanner.nextInt();
            }
        }

        RichestCusWealth solution = new RichestCusWealth();
        int result = solution.maximumWealth(accounts);

        System.out.println("Maximum wealth among all customers: " + result);
        scanner.close();
    }
}
