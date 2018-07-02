package methodEmbedding.Standing_Ovation.S.LYD1003;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(in.readLine());
        cas: for (int i = 0; i < cases; i++) {
            String persons = in.readLine().split(" ")[1];
            
            int standing = 0;
            int extras = 0;
            for (int j = 0; j < persons.length(); j++) {
                int iter = Integer.parseInt(String.valueOf(persons.charAt(j)));
                if (iter > 0) {
                    if (j > standing) {
                        int diff = j - standing;
                        standing += diff;
                        extras += diff;
                    }
                    standing += iter;
                }
            }
            
            System.out.println("Case #" + (i + 1) + ": " + extras);
        }
    }
}
