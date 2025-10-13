public class ExcelColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;  // adjust for 1-based indexing (A=1 → Z=26)
            char ch = (char) ('A' + (columnNumber % 26));
            sb.append(ch);
            columnNumber /= 26;
        }

        return sb.reverse().toString();  // reverse to get correct order
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(convertToTitle(1));    // Output: A
        System.out.println(convertToTitle(28));   // Output: AB
        System.out.println(convertToTitle(701));  // Output: ZY
        System.out.println(convertToTitle(52));   // Output: AZ
    }
}
