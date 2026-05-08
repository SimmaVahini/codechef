import java.util.*;

class Codechef {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int T = sc.nextInt();
            while(T-- > 0){
                int N = sc.nextInt();
                int X = sc.nextInt();
                
                if(X % N == 0) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
