public class prime {
    public static boolean isprime(int n)
    {
        if(n<=1) return false;
        for(int i=2;i<n;i++)
        {
            if(i==n) continue;
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(isprime(n));
    }
    
}
