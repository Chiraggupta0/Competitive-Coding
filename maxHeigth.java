class solution{
    public void woodpossible(int h[], int n,int k)
    {
        for(int i=0;i<n;i++)
        {
            int sum=0;
            if(h[i]>k)
            {
                int S=h[i]-k;
                sum+=S;
            }
            if(sum>=k)
            {
                System.out.println(sum);
            }
        }
    }
}

class maxHeigth
{
    public static void main(String args[])
    {
        solution obj = new solution();
        int h[]={7,9,3,14,12,1,3,5,2,6};
        int n=10;
        int k=8;
        obj.woodpossible(h,n,k);
    }
}