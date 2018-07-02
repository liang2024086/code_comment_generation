package methodEmbedding.Revenge_of_the_Pancakes.S.LYD733;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jam2 {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(r.readLine());
        for (int i = 1; i < t + 1; i++) {
            String s = r.readLine();
            char last = '+';
            int num = 0;
            for (int j = s.length() - 1; j >= 0; j--) {
                char c = s.charAt(j);
                if (c != last){
                    num++;
                    last = c;
                }
            }
            System.out.println("Case #" + i + ": " + num);
        }
    }
    
}
