import java.util.*;
public class _count_substring {
    // public static int func(String s,int k)
    //     {
    //         int max=0;
    //         int n=s.length();
    //         Map<Character,Integer> map= new HashMap<>();
    //         for(int i=0;i<n;i++)
    //         {
    //             map.clear();
    //             for(int j=i;j<n;j++)
    //             {
    //                 char ch=s.charAt(j);
    //                 map.put(ch, map.getOrDefault(ch,0)+1);

    //                 if(map.size() <=k)
    //                 {
    //                     max=Math.max(max, j-i+1);
    //                 }
    //                 else{
    //                     break;
    //                 }
    //             }
    //         }
    //         return max;
    //     }

    public static int countSubstr(String s, int k) {
        //  code here
        int count=0;
        Map<Character,Integer> map= new HashMap();
        for(int i=0;i<s.length();i++)
        {
            map.clear();
            for(int j=i;j<s.length();j++)
            {
                char ch=s.charAt(j);
                map.put(ch, map.getOrDefault(ch,0)+1);
                if(map.size()==k)
                {
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s="zatpvvsnhx";
        int k=1;
        int ans=countSubstr(s,k);
        System.out.println(ans);
    }
}
