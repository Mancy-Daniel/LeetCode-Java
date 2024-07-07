import java.util.Scanner;

// 1518. Water Bottles
/*Input: numBottles = 9, numExchange = 3
Output: 13
Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
Number of water bottles you can drink: 9 + 3 + 1 = 13.
Input: numBottles = 15, numExchange = 4
Output: 19
Explanation: You can exchange 4 empty bottles to get 1 full water bottle.
Number of water bottles you can drink: 15+3 + 1 = 19.*/
class WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int nb = numBottles;
        int DB = 0;
        int EB = 0;
        while (nb >= numExchange) {
            DB = nb / numExchange;
            EB = nb % numExchange;
            numBottles = numBottles + DB;
            nb = DB + EB;
        }
        return numBottles;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numBottles = sc.nextInt();
        int numExchange = sc.nextInt();
        System.out.println(numWaterBottles(numBottles, numExchange));
        sc.close();
    }
}