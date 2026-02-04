import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2178b {
    
    public static void main(String[] args) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        while(a>0)
        {
            int b=Integer.parseInt(br.readLine());
            String line=br.readLine();
            String[] parts=line.split(" ");
            StringBuffer str = new StringBuffer(parts[0]);
            
            if(b<=1)
            {
                System.out.println(line.toString());
                a--;
                continue;
            }


            
            for(int i=1;i<parts.length;i++)
            {
                String front = parts[i] + str.toString();
                String back  = str.toString() + parts[i];

                
                if (front.compareTo(back) < 0) {
                    str = new StringBuffer(front);
                } else {
                    str = new StringBuffer(back);
                }
            }

            System.out.println(str.toString());
            a--;
        }
                    
    }
}
