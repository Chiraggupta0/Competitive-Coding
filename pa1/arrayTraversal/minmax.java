package arrayTraversal;

public class minmax {
    public static void f(int[] arr)
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:arr)
        {
            if(num>max) max=num;
            if(num<min) min=num;
        }
        System.out.println(min);
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr={23,33,53,6,22,43,866,45,1,0};
        f(arr);
    }
}