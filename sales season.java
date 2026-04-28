import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            int discount = 0;

            if (X <= 100) {
                discount = 0;
            } else if (X <= 1000) {
                discount = 25;
            } else if (X <= 5000) {
                discount = 100;
            } else {
                discount = 500;
            }

            System.out.println(X - discount);
        }

        sc.close();
    }
}
