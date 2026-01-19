public class _3005 {
    public static void main(String args[])
        //int largestFrequency=0;
           {
                int[] nums={1,2,3,4,5,6,6,5};
                int n=nums.length;
                int[] nums2= new int[n];
                int k=0;
                for(int j=1;j<=n;j++)
                {
                    int frequency=0;
                    for(int i=k;i<n;i++)
                    {
                        if(nums[k]==nums[i])
                        {
                            frequency++;
                        } 
                    }
                    k++;
                    nums2[k-1]=frequency;
                }
                for(int i=0;i<n;i++)
                {
                    System.out.println(nums2[i]);
                }
            // check for largest
            int largest=nums2[0];
            for(int i=1;i<n;i++)
            {
                if(largest<=nums2[i])
                {
                    largest=nums2[i];
                }
            }
            // check for largest no frequency
            int count=0;
            for(int i=0;i<n;i++)
            {
                if(largest==nums2[i])
                {
                    count++;
                }
            }
            System.out.println(largest*count);

            }
}
            