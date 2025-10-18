public class _5 {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);     // Odd-length palindrome
            int len2 = expandFromCenter(s, i, i + 1); // Even-length palindrome
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    // Helper method to expand around center
    private int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Length of palindrome
    }

    // Main method to test
    public static void main(String[] args) {
        _5 sol = new _5();

        String s1 = "babad";
        String s2 = "cbbd";

        System.out.println("Input: " + s1 + " -> Longest Palindrome: " + sol.longestPalindrome(s1));
        System.out.println("Input: " + s2 + " -> Longest Palindrome: " + sol.longestPalindrome(s2));
    }
}
