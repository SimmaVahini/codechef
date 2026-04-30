import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            if (N % 4 == 0) {
                System.out.println("Good");
            } else {
                System.out.println("Not Good");
            }
        }

        sc.close();
    }
}
