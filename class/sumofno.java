public class sumofno {
    public static void main(String[] args) {
        int no=1234;
        int sum=0;
        int ld=0;
        while(no!=0)
        {
            ld=no%10;
            sum+=ld;
            no/=10;
        }
        System.out.println(sum);
    }
}
