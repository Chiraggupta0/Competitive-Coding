import java.util.*;

class _3 {
    public int lengthOfLongestSubstring(String s) {
        // HashSet to store unique characters
        HashSet<Character> set = new HashSet<>();
        
        int left = 0, right = 0;
        int maxLen = 0;

        // Expand the window
        while (right < s.length()) {
            char c = s.charAt(right);

            // If duplicate, move left pointer to remove duplicate
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current char and update max length
            set.add(c);
            maxLen = Math.max(maxLen, right - left + 1);

            right++;
        }

        return maxLen;
    }

    // For quick testing
    public static void main(String[] args) {
        _3 sol = new _3();
        System.out.println(sol.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(sol.lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(sol.lengthOfLongestSubstring("pwwkew"));   // 3
    }
}
