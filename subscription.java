import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            
            int subscriptions = (N + 5) / 6; // ceil(N/6)
            int cost = subscriptions * X;
            
            System.out.println(cost);
        }
        
        sc.close();
    }
}
