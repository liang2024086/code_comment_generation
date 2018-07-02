package methodEmbedding.Revenge_of_the_Pancakes.S.LYD158;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class HappyPancake {

    public static void main(String[] args) throws Exception {
        File file = new File("./src/com/google/codejam/pancake/B-small-attempt0.in");
        File outFile = new File("./src/com/google/codejam/pancake/B-small-attempt0.out");
        BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int flipCount = 0;
        long testCases = Long.valueOf(reader.readLine());
        for(int index = 1; index <= testCases; index++) {
            String line = reader.readLine();
            char[] values = line.toCharArray();
            flipCount = 0;
            char last = values[0];
            for(char val: values) {
                if(last == val) {
                    continue;
                }
                flipCount += 1;
                last = val;
            }
            if(last == '-') {
                flipCount++;
            }
            writer.write("Case #" + index + ": " + flipCount + "\n");
        }
        reader.close();
        writer.flush();
        writer.close();
    }

}
