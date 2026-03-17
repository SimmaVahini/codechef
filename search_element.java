import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        // 1. Read N (size) and X (target element)
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            
            boolean found = false;
            
            // 2. Iterate through the array to find X
            for (int i = 0; i < n; i++) {
                int current = sc.nextInt();
                if (current == x) {
                    found = true;
                    // Note: We don't break immediately if we need to read 
                    // all N elements to clear the scanner buffer.
                }
            }
            
            // 3. Output YES if found, otherwise NO
            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
