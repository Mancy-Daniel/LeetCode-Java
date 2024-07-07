import java.util.Scanner;

//Pass The Pillow
/*Input: n = 4, time = 5
Output: 2
Explanation: People pass the pillow in the following way: 1 -> 2 -> 3 -> 4-> 3-> 2.
After five seconds, the 2nd person is holding the pillow.*/
class PassPillow {
    public static int passThePillow(int n, int time) {
        int position = 0;
        if (n > time) {
            position = time + 1;
        } else {
            int completedRound = time / (n - 1);
            int remainingPasses = time % (n - 1);
            if (completedRound % 2 != 0) {
                position = n - remainingPasses;
            } else {
                position = remainingPasses + 1;
            }
        }
        return position;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = sc.nextInt();
        System.out.println(passThePillow(n, time));
        sc.close();
    }
}
