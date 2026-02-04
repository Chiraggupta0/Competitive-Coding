
public class _1to5 {
    public static void rec(int n)
    {
        if(n==0)
            {
                
                return;
            } 
        System.out.print(n);
        rec(n-1);
        
    }
    public static void main(String[] args) {
        int n=5;
        rec(n);
    }
}
