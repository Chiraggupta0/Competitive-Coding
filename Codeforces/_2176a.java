
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2176a {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t>0)
        {
            int arrsize=Integer.parseInt(br.readLine());
            
                
                    String line = br.readLine();
                    String[] parts= line.split(" ");
                    int [] arr = new int[parts.length];
                    for (int k = 0; k < parts.length; k++) {
                        arr[k] = Integer.parseInt(parts[k]);
                    }

                    int n=arr.length;
                    int op=0;
                    int i=0;
                    int j=1;
                    while(j<n)
                    {
                        if(arr[i]>arr[j])
                        {
                            op++;
                            j++;
                        }
                        else{
                            i=j;
                            j++;
                        }
                    }
                    System.out.println(op);
                
            
            t--;
        }
        
        
    }
}
