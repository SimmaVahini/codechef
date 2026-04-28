import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int pizzas = (n * x + 3) / 4;
            System.out.println(pizzas);
        }

        sc.close();
    }
}
