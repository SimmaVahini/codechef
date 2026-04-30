import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int cars = (N + 3) / 4;
            System.out.println(cars);
        }

        sc.close();
    }
}
