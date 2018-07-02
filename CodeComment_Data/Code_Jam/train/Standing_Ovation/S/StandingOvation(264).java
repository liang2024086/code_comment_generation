package methodEmbedding.Standing_Ovation.S.LYD826;

import java.io.*;

public class StandingOvation {

    public static void main (String[] args) {
        BufferedReader br;
        BufferedWriter bw;
        try {
            br = new BufferedReader(new FileReader("A-small-attempt0.in"));
            bw = new BufferedWriter(new FileWriter("A-small.out"));
            int n = Integer.parseInt(br.readLine());
            for (int iii = 1; iii <= n; iii++) {
                bw.write("Case #" + iii + ": ");
                String[] line = br.readLine().split(" ");
                int smax = Integer.parseInt(line[0]);
                int numStanding = 0;
                int needed = 0;
                for (int jjj = 0; jjj <= smax; jjj++) {
                    if (numStanding < jjj) {
                        int temp = jjj - numStanding;
                        needed += temp;
                        numStanding += temp;
                    }
                    numStanding += line[1].charAt(jjj) - 48;
                }
                bw.write("" + needed);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
