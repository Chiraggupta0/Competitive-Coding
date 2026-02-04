//gcd/hcf
import java.util.Scanner;
class gdc1
{
	public static int gcd(int n1,int n2)
	{
        int ans=1;
        int Min=Math.min(n1,n2);
        for(int i=2;i<=Min;i++)
        {
            if(n1%Min==0 && n2%Min==0)
            {
                ans=i;
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(gcd(n1,n2));



// lcm=n1*n2/gcd(n1,n2)

        int lcm=(n1*n2)/gcd(n1,n2);
        System.out.println(lcm);
        sc.close();
    }
}


		
