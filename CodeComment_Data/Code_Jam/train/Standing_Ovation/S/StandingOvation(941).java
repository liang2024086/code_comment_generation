package methodEmbedding.Standing_Ovation.S.LYD1068;


import java.io.*;

/**
 * Created by anthony on 4/11/15.
 */
public class StandingOvation {

    public static void main(String args[]) throws IOException {
        long t1 = System.currentTimeMillis();
        BufferedReader reader = new BufferedReader(new FileReader("src/google/codejam2015/round1a/A-small-practice" +
                ".in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/google/codejam2015/round1a/A-small-practice" +
                ".out"));
        String temp = reader.readLine();
        int T = Integer.parseInt(temp);
        for (int _t = 0; _t < T; _t++) {
            System.out.println(_t);
            temp = reader.readLine();
            String temp2[] = temp.split(" ");
            int N = Integer.parseInt(temp2[0]);
            int needed = 0, count = 0;
            for(int i = 0; i <= N; i++) {
                int current = temp2[1].charAt(i) - '0';
                if(i > count) {
                    needed += (i - count);
                    count += (i - count);
                }
                count += current;
            }

            writer.write("Case #");
            writer.write(""+(_t + 1));
            writer.write(": ");
            writer.write(""+needed);
            writer.newLine();
        }
        reader.close();
        writer.close();
        long t2 = System.currentTimeMillis();
        System.out.println("Time(s):"+(t2-t1)/1000);
    }
}
