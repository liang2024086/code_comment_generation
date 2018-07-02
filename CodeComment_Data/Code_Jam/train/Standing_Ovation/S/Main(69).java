package methodEmbedding.Standing_Ovation.S.LYD1491;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("new.in"));
        FileWriter output = new FileWriter("new.out");
        int t = Integer.parseInt(input.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer line = new StringTokenizer(input.readLine());
            int s = Integer.parseInt(line.nextToken());
            String adu = line.nextToken();
            int countneed = 0;
            int counthave = Integer.parseInt(adu.charAt(0)+"");
            for (int j = 1; j <= s; j++) {
                if (j > counthave) {
                    countneed += (j - counthave);
                    counthave += (j - counthave);
                }
                counthave += Integer.parseInt(adu.charAt(j)+"");
            }
            output.append("Case #" + (i + 1) + ": " + countneed + "\n");
        }
        output.close();
    }
}
