package pa2;
class palindrome {
    public static boolean isPalindrome(String s) {
        String ans=new String();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (!Character.isLetterOrDigit(ch)) continue;
            ans=ans+Character.toLowerCase(ch);
        }
        int i=0;
        int j=ans.length()-1;
        while(i<=j)
        {
            char c=ans.charAt(i);
            char d=ans.charAt(j);
            if(c!=d) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }
}