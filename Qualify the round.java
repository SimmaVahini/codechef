import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            int score = A + 2 * B;

            if (score >= X) {
                System.out.println("Qualify");
            } else {
                System.out.println("NotQualify");
            }
        }

        sc.close();
    }
}
