import java.util.*;

public class _66 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from the last digit to the first
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;    // Just add 1 and return
                return digits;
            }
            digits[i] = 0;      // Set to 0 and carry to next
        }

        // If all digits were 9, we need an extra 1 at the beginning
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;  // The rest will be 0 by default
        return newNumber;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int[] result = plusOne(digits);

        System.out.print("Result: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
