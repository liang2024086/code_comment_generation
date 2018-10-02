package methodEmbedding.Standing_Ovation.S.LYD886;

import java.io.IOException;

public class StandingOvation {

    public static void main(String[] args) throws IOException {

        java.io.BufferedReader r = new java.io.BufferedReader
                (new java.io.InputStreamReader (System.in));

        String line;
        int c = 0;
        int t = Integer.parseInt(r.readLine());

        while(t > 0) {
            line = r.readLine();
            String[] components = line.split(" ");
            int smax = Integer.parseInt(components[0]);
            int minf = 0;

            int totalStanding = 0;

            for(int i = 0; i <= smax; i++) {
                //System.out.println(components[1].substring(i, i + 1));
                int aud = Integer.parseInt(components[1].substring(i, i + 1));
                if(totalStanding >= i || aud == 0) {
                    totalStanding += aud;
                } else {
                    minf += i - totalStanding;
                    totalStanding += minf + aud;
                }
            }
            System.out.println("Case #" + (c + 1) + ": " + minf);
            t--;
            c++;
        }
    }
}
