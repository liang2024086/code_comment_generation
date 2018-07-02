package methodEmbedding.Standing_Ovation.S.LYD945;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        for (int c = 0; c < num; c++) {
            String[] round = in.readLine().split(" ");
            int Smax = Integer.parseInt(round[0]);
            int[] s = new int[Smax + 1];
            for (int i = 0; i < s.length; i++) {
                s[i] = Integer.parseInt(round[1].substring(i, i + 1));
            }
            int standing = 0;
            int extra = 0;
            for (int i = 0; i < s.length; i++) {
                if (standing < i) {
                    extra += i - standing;
                    standing = i;
                }
                standing += s[i];
            }
            System.out.println("Case #" + (c + 1) + ": " + extra);
        }
    }
}
