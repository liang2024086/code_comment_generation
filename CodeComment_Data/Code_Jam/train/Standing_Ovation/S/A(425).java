package methodEmbedding.Standing_Ovation.S.LYD1795;

import java.util.Scanner;


public class A {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int T = Integer.parseInt(in.nextLine());
        
        for (int k = 0; k < T; ++ k) {
            String line = in.nextLine();
            String[] tokens = line.split(" ");
            int s = Integer.parseInt(tokens[0]);
            
            int ans = 0;
            if (s != 0) {
                int[] c = new int [s + 1];
                
                for (int i = 0; i < s + 1; ++ i) {
                    c[i] = tokens[1].charAt(i) - '0';
                }
                
                int sum = c[0];
                for (int i = 1; i < s + 1; ++ i) {
                    if (sum < i) {
                        ans += i - sum;
                        sum = i + c[i];
                    }
                    else {
                        sum += c[i];
                    }
                }
            }
            
            System.out.println("Case #" + (k + 1) + ": " + ans);
        }
        
        in.close();
    }
    
}
