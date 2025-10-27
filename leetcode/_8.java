// File name: _8.java
public class _8 {
    public static int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        int i = 0, n = s.length();
        // Step 1: Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Handle sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert digits to integer
        long num = 0; // use long to check overflow before casting
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            
            // Step 4: Handle overflow
            if (num * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (num * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            
            i++;
        }

        // Step 5: Return result with sign
        return (int) (num * sign);
    }

    public static void main(String[] args) {
        // Example test cases
        System.out.println(myAtoi("42"));        // Output: 42
        System.out.println(myAtoi("   -042"));   // Output: -42
        System.out.println(myAtoi("1337c0d3"));  // Output: 1337
        System.out.println(myAtoi("words"));     // Output: 0
        System.out.println(myAtoi("-91283472332")); // Output: -2147483648 (clamped)
    }
}
