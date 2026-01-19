public class _189_2 {
    public static void main(String args[])
    {
        int[] nums={1,2,3,4,5,6,7};
        int n=nums.length;
        int[] rotatedArray= new int[n];
        int k=9;
        k%=n;
        for(int i=0;i<n;i++)
        {
            int h=(i+k)%n;
            rotatedArray[h]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(rotatedArray[i]);
        } 
    }
    
}
