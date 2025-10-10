class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        int left = 1, right = x, ans = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2; // use long to avoid overflow

            if (mid * mid == x)
                return (int) mid;
            else if (mid * mid < x) {
                ans = (int) mid; // store possible answer
                left = (int) mid + 1;
            } else {
                right = (int) mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.mySqrt(4));  // Output: 2
        System.out.println(sol.mySqrt(8));  // Output: 2
    }
}
