import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read X (stoves) and Y (minutes)
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            // Total customers = Stoves * Minutes
            int totalCustomers = x * y;

            // Output the result
            System.out.println(totalCustomers);
        }
        sc.close();
    }
}
