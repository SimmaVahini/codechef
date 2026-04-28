import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int B1 = sc.nextInt();
            int B2 = sc.nextInt();
            int B3 = sc.nextInt();

            int emptyCount = 0;

            if (B1 == 0) emptyCount++;
            if (B2 == 0) emptyCount++;
            if (B3 == 0) emptyCount++;

            if (emptyCount >= 2) {
                System.out.println("Water filling time");
            } else {
                System.out.println("Not now");
            }
        }

        sc.close();
    }
}
