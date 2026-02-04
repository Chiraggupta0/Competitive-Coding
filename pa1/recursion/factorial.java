package recursion;

public class factorial {
    public static int fact(int n)
    {
        if(n==1) return 1;
        if(n==2) return 2;
        return fact(n-1)*n;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
