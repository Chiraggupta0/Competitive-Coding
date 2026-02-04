package arrayTraversal;

public class freqCount {
    public static int freq(int[] arr, int n)
    {
        int no=0;
        for(int nums:arr)
        {
            if(nums==n) no++;
        }
        return no;
    }
    public static void main(String[] args) {
        int[] arr={22,43,54,65,76,88,3,1,4,2,555,43,43};
        System.out.println(freq(arr,43));
    }
}
