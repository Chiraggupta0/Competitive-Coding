import java.util.Map;
import java.util.HashMap;



public class _3005_2 {
    public static void main(String args[])
    {
        int[] nums={1,2,3,4,2,3,2,3};
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num:nums)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        int maxFreq=0;
        for(int f:freq.values())
        {
            if(f>maxFreq)
            {
                maxFreq=f;
            }

        }
        
        int total=0;
        for(int f:freq.values())
        {
            if(f==maxFreq)
            {
                total+=f;
            }
        }
        System.out.println(total);
    }
}
