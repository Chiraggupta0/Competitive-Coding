import java 
class recFactorial
{
    int fact(int n)
    {
        if(n==1) return 1;
        if(n==0) return 1;
        return n*(fact(n-1));

    }
    public static void main(String args[])
    {
        int n=4;
        recFactorial obj = new recFactorial();
        int result=obj.fact(n);
        System.out.println(result);
        
    }
}