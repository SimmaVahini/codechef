import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		// 1. Read the number of test cases (T)
		if(sc.hasNextInt()){
		    int t = sc.nextInt();
		    
		    while(t-- > 0){
		        // 2. Read the size of the array (N)
		        int n = sc.nextInt();
		        int maxVal = Integer.MIN_VALUE;
		        
		        // 3. Loop through N elements to find the maximum
		        for(int i = 0; i < n; i++){
		            int current = sc.nextInt();
		            if(current > maxVal){
		                maxVal = current;
		            }
		        }
		        
		        // 4. Print the result for this test case
		        System.out.println(maxVal);
		    }
		}
	}
}
