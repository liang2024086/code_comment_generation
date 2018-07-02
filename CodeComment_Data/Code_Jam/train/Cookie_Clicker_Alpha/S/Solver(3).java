package methodEmbedding.Cookie_Clicker_Alpha.S.LYD872;

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Solver
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        String line = new String();

        try {
            BufferedReader in = new BufferedReader(new FileReader(new File("B-small-attempt0.in")));
            final int numCases = Integer.parseInt(in.readLine());

            for (int caseId = 1; caseId <= numCases; caseId++) {
                String[] tokens = in.readLine().split("\\s+");
                final double C = Double.parseDouble(tokens[0]);  // farm's cost
                final double F = Double.parseDouble(tokens[1]);  // cookies' production rate
                final double X = Double.parseDouble(tokens[2]);  // cookies' goal
                double time = 0.0;
                double rate = 2.0;

                while (true) {
                    time += C/rate;  // time to get to the next farm
                    if ((X - C)/rate < X / (rate + F)) {
                        time += (X - C)/rate;
                        break;
                    }
                    else {
                        rate = rate + F;
                    }
                }
                
                DecimalFormat df = new DecimalFormat("0.0000000");
                sb.append("Case #" + caseId + ": " + df.format(time) + "\n");
            }
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("output.txt")));
            bw.write(new String(sb));
            bw.close();
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
