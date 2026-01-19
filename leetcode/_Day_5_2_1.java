public class _Day_5_2_1 {
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,3,4};
        System.out.println(firstRepeated(arr));
    }
    public static int firstRepeated(int[] arr) {
        // code here
       
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                return i+1;
                }
            }
            
        }
        return -1;
    }
}

