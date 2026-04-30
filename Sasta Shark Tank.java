import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            int val1 = A * 10;
            int val2 = B * 5;

            if (val1 > val2) {
                System.out.println("FIRST");
            } else if (val1 < val2) {
                System.out.println("SECOND");
            } else {
                System.out.println("ANY");
            }
        }

        sc.close();
    }
}
