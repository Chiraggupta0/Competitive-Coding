public class reverseano {
    public static int rev(int n)
    {
        int num=0;
        int rem=0;
        while(n!=0)
        {
            rem=n%10;
            num=(num*10)+rem;
            n/=10;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(rev(1234));
    }
    
}
