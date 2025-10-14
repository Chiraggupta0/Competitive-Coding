class Solution {
    public int romanToInt(String s) {
        int result = 0;
        
        // Map each Roman numeral to its value
        java.util.Map<Character, Integer> roman = new java.util.HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        
        // Loop through the string
        for (int i = 0; i < s.length() - 1; i++) {
            int current = roman.get(s.charAt(i));
            int next = roman.get(s.charAt(i + 1));
            
            // If current < next, subtract it
            if (current < next)
                result -= current;
            else
                result += current;
        }
        
        // Add the last value
        result += roman.get(s.charAt(s.length() - 1));
        
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "MCMXCIV";
        System.out.println(sol.romanToInt(s)); // Output: 1994
    }
}
