// gcd using recursion
//  euclidean formula== gcd(a,b)=(b,a%b);
//  for lcm =(no1*no2)/gcd(no1,no2);

class gcd
{
    public static int recgcd(int a,int b)
    {
        if(b==0) return a;
        return recgcd(b,a%b);
    }
    public static void main(String[] args) {
        int a=11;
        int b=27;
        System.out.println("gcd of no are " + recgcd(a,b));
        int lcm=(a*b)/recgcd(a,b);
        System.out.println("lcm is " + lcm);

    }
}