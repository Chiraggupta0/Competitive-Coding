import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            if (n == 1) {
                System.out.println(1);
                continue;
            }

            
            if (n == 2) {
                System.out.println(1);
                continue;
            }

            int sum = 0;
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = s.charAt(i) - '0';
            }

           
            for (int j = 1; j < n - 1; j = j + 2) {
                if (arr[j] == 1) continue;

                if (arr[j - 1] == 0 && arr[j + 1] == 0) {
                    arr[j] = 1;
                }
            }

            for (int k = 0; k < n; k++) {
                sum += arr[k];
            }

            System.out.println(sum);
        }
    }
}
