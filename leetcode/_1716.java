// Filename: _1716.java
// Problem: 1716. Calculate Money in Leetcode Bank

public class _1716 {

    // Function to calculate total money after n days
    public static int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;

        // Sum of full weeks using arithmetic series formula
        int total = weeks * (28 + (28 + 7 * (weeks - 1))) / 2;

        // Remaining days (partial week)
        int start = weeks + 1;
        for (int i = 0; i < days; i++) {
            total += start + i;
        }

        return total;
    }

    public static void main(String[] args) {
        // Testcases
        int[] testCases = {4, 10, 20, 7, 8};

        for (int n : testCases) {
            int result = totalMoney(n);
            System.out.println("Input: " + n + " -> Output: " + result);
        }
    }
}
