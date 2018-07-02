package methodEmbedding.Standing_Ovation.S.LYD179;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StandingOvation {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(args[0])));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(args[1]))));
        int iterationsNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < iterationsNum; ++i) {
            String[] line = br.readLine().split("\\s+");
            int levelsNum = Integer.parseInt(line[0]);
            char[] shynessLevels = line[1].toCharArray();

            int total = 0;
            int added = 0;

            for (int shynessLevel = 0; shynessLevel < levelsNum + 1; ++shynessLevel) {
                if (shynessLevel > total) {
                    added += shynessLevel - total;
                    total += shynessLevel - total;
                }
                total += Character.getNumericValue(shynessLevels[shynessLevel]);
            }

            bw.write("Case #" + (i + 1) + ": " + added + "\n");
        }

        br.close();
        bw.close();

    }

}
