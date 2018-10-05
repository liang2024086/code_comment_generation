package methodEmbedding.Cookie_Clicker_Alpha.S.LYD928;

import java.io.*;
import java.util.StringTokenizer;

public class cookieclicker {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("cookieclicker.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cookieclicker.out")));
        int numberRounds = Integer.parseInt(f.readLine());
        for (int a = 0; a < numberRounds; a++) {
            StringTokenizer stringTokenizer = new StringTokenizer(f.readLine());
            double timeSpent = 0;
            double cost = Double.parseDouble(stringTokenizer.nextToken());
            double productionIncrease = Double.parseDouble(stringTokenizer.nextToken());
            double goal = Double.parseDouble(stringTokenizer.nextToken());
            double curProduction = 2;
            while (true) {
                double timeToNextProduction = cost / curProduction;
                double timeToTotal = goal / curProduction;
                double timeNextTotal = (goal) / (curProduction + productionIncrease);
                if (timeToTotal <= timeNextTotal + timeToNextProduction) {
                    timeSpent += timeToTotal;
                    break;
                }
                curProduction+=productionIncrease;
                timeSpent += timeToNextProduction;
            }
            out.println("Case #" + (a+1) + ": " + timeSpent);
        }
        out.close();
    }
}
