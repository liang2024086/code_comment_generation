package methodEmbedding.Counting_Sheep.S.LYD697;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Countingsheep {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(in.readLine());
            int sum = n;
            HashSet<Integer> h = new HashSet<>();
            
            if (n == 0) {
                System.out.println("Case #" + (i + 1) + ": INSOMNIA");
            } else {
                while(true) {
                    String s = sum + "";
                    for (int j = 0; j < s.length(); j++) {
                        h.add(Integer.parseInt(s.charAt(j) + ""));
                    }
                    if (h.size() < 10) {
                        sum += n;
                    } else {
                        break;
                    }    
                }
                System.out.println("Case #" + (i + 1) + ": " + sum);
            }
        }
    }
    
}
