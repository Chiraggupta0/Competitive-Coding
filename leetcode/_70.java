import java.util.*;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int first = 1;   // f(1)
        int second = 2;  // f(2)
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = first + second;  // f(n) = f(n-1) + f(n-2)
            first = second;
            second = result;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of steps (n): ");
        int n = sc.nextInt();

        int ways = climbStairs(n);
        System.out.println("Number of distinct ways to climb to the top: " + ways);
        
        sc.close();
    }
}

