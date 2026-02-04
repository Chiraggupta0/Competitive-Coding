package recursion;

public class sumofdigit {
    public static int sumofn(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumofn(12345));
    }
    
}
