class solution
{
    int fact(int n, int m)
    {
        if(m==0) return 1;
        if(n==0) return 0;
        if(n==1) return 1;
        m--;
        return n*fact(n,m);
        
    }
}
class recPower
{
    public static void main(String args[])
    {
        solution obj = new solution();
        int result=obj.fact(3,4);
        System.out.println(result);
    }
}