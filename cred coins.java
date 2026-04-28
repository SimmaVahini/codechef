import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int bags = (X * Y) / 100;
            System.out.println(bags);
        }

        sc.close();
    }
}
