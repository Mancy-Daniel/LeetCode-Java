import java.util.*;

// 7. Reverse Integer
class ReverseInteger {
    public static int reverse(int x) {
        int y;
        if (x < 0) {
            y = x * -1;
        } else
            y = x;
        int res = 0;
        while (y > 0) {
            int ld = y % 10;
            if (res > (Integer.MAX_VALUE - ld) / 10) {
                return 0;
            }
            res = (res * 10) + ld;
            y = y / 10;
        }
        if (x < 0)
            return res * -1;
        else
            return res;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(reverse(x));
    }
}