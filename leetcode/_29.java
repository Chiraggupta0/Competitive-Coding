class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        // Check if result should be negative
        boolean negative = (dividend < 0) ^ (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int result = 0;

        while (a >= b) {
            long temp = b;
            int multiple = 1;

            // Keep doubling divisor until it exceeds 'a'
            while (a >= (temp << 1)) {
                temp <<= 1;          // temp = temp * 2
                multiple <<= 1;      // multiple = multiple * 2
            }

            a -= temp;               // subtract the largest multiple
            result += multiple;      // add that multiple to result
        }

        // Apply sign
        if (negative)
            result = -result;

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.divide(10, 3));          // 3
        System.out.println(sol.divide(7, -3));          // -2
        System.out.println(sol.divide(2147483647, 3));  // 715827882
    }
}
