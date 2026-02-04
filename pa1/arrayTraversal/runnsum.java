package arrayTraversal;

public class runnsum {
    public static void runsum(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];;
            arr[i]=sum;
        } 
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        runsum(arr);
    }
    
}
