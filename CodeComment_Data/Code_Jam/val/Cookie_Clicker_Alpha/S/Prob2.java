package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1355;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prob2 {
    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("/Users/octavian/codejam/B-small-attempt0.in.txt"));
        FileWriter writer = new FileWriter(new File("/Users/octavian/codejam/B-small-attempt0.out.txt"));
        int n = scanner.nextInt();
        int c = 1;
        for (int i = 0; i < n; i++) {
            double cost = scanner.nextDouble(), extra = scanner.nextDouble(), req = scanner.nextDouble();
            double bestTime = req / 2;
            double timeForFarms = 0;
            double currExtra = 2;
            while(true) {
                double improvedTime = timeForFarms + (cost / currExtra) + (req / (currExtra + extra));
                if (bestTime > improvedTime) {
                    bestTime = improvedTime;
                    timeForFarms += (cost / currExtra);
                    currExtra += extra;
                } else {
                    break;
                }
            }
            writer.write("Case #" + (c++) + ": " + String.format("%.7f", bestTime) + "\n");
        }
        writer.close();
        scanner.close();
    }
}
