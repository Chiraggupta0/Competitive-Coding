public class _189 {
    public static void main(String args[])
        {
            int[] nums={1,2,3,4,5,6,7};
            int k=3;
            int[] rotatedArray=new int[nums.length];
            int n= nums.length;
            k%=n;
            int h=0;
            for(int i=n-k;i<n;i++)
            {
                rotatedArray[h]=nums[i];
                h++;
            }
            for(int j=0;j<n-k;j++)
            {
                rotatedArray[h]=nums[j];
                h++;
            }

            for(int i=0;i<n;i++)
            {
                System.out.print(rotatedArray[i]);
            }
        
        }
        
}

