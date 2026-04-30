import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();

            if (X <= 50) {
                System.out.println("LEFT");
            } else {
                System.out.println("RIGHT");
            }
        }

        sc.close();
    }
}
