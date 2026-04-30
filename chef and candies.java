import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();

            if (X >= N) {
                System.out.println(0);
            } else {
                int need = N - X;
                int packets = (need + 3) / 4;
                System.out.println(packets);
            }
        }

        sc.close();
    }
}
