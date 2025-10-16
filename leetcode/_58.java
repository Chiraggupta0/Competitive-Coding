public class _58 {
    public static int lengthOfLastWord(String s) {
        s = s.trim(); // Remove leading and trailing spaces
        int count = 0;
        
        // Traverse from end of string
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                break; // Stop when space found after counting word
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println("Input: \"" + s1 + "\" → Output: " + _58(s1));
        System.out.println("Input: \"" + s2 + "\" → Output: " + _58(s2));
        System.out.println("Input: \"" + s3 + "\" → Output: " + _58(s3));
    }
}
