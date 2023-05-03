package p1;

import java.util.Scanner;

public class Unique {
    public static int numTrees(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        
        return dp[n];
    }
    
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the number");
        int n = sc.nextInt();
        int numUniqueBSTs = numTrees(n);
        System.out.println("Number of unique BSTs with " + n + " nodes: " + numUniqueBSTs);
        
    }
}