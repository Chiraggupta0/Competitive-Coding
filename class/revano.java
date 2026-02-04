public class revano {
    public static void main(String[] args) {
        int no=1234;
        int rev=0;
        while(no!=0)
        {
            int last=no%10;
            rev=rev*10+last;
            no=no/10;
        }
        System.out.println(rev);
    }
}
