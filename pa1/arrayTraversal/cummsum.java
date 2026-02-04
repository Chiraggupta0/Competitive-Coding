package arrayTraversal;

public class cummsum {
    public static void cumsum(int[] arr)
    {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int x : prefix)
            System.out.print(x + " ");
    }
    public static void main(String[] args) {
        int[] arr = {1, 23, 43, 44, 33};
        cumsum(arr);
    }
    
}
