import java.util.Scanner;

// 1550. Three Consecutive Odds
/*Input: arr = [1,2,34,3,4,5,7,23,12]
Output: true
Explanation: [5,7,23] are three consecutive odds. */
class Solution {
    public static boolean threeConsecutiveOdds(int[] arr) {

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 != 0 && (arr[i + 1]) % 2 != 0 && (arr[i + 2]) % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(threeConsecutiveOdds(arr));
    }
}
