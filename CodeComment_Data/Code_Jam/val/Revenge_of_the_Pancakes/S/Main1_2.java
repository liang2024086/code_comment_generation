package methodEmbedding.Revenge_of_the_Pancakes.S.LYD891;


import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main1_2 {
    public static void main(String[] args) throws IOException, URISyntaxException {
        List<String> input = Files.readAllLines(Paths.get(new File("C:\\github\\CodeJam1_1\\input").listFiles()[0].toURI()));

        OutputStream os = new FileOutputStream("output.txt");
        PrintWriter pw = new PrintWriter(os);

        for (int i = 1; i < input.size(); i++) {
            String cur = input.get(i);
            int res = 0;

            char side = cur.charAt(0);

            for (int j = 0; j < cur.length(); j++) {
                char nextSide = cur.charAt(j);
                if (side != nextSide){
                    res++;
                    side = nextSide;
                }
            }

            if (side == '-'){
                res++;
            }

            pw.println("Case #" + i + ": " + res);
        }

        pw.close();
    }
}
