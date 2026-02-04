package recursion;

public class fibonacci {
    public static int fibn(int n)
    {
        if(n<=1) return n;
        return fibn(n-1)+fibn(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibn(7));
    }
    
}
