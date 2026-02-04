package pa2;
import java.util.Arrays;

public class reverse {
    public static void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j)
        {
            char temp =s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
            
        }
        
    }
    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
        reverseString(s);
        System.out.print(Arrays.toString(s));
    }
}
