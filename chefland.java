import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            boolean allZero = true;

            for (int i = 0; i < 4; i++) {
                int r = sc.nextInt();
                if (r == 1) {
                    allZero = false;
                }
            }

            if (allZero) {
                System.out.println("IN");
            } else {
                System.out.println("OUT");
            }
        }

        sc.close();
    }
}
