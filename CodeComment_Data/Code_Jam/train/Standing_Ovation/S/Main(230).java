package methodEmbedding.Standing_Ovation.S.LYD626;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by kening on 4/3/15.
 */
public class Main {
    public static void main(String[] arg) {
//        System.out.println(System.getProperty("user.dir"));

        int numTestCase = 0;

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("A-small-attempt0.in"));
            String line = br.readLine();

            int numCase = Integer.parseInt(line);

            HashMap<Integer, Integer> shyMap = new HashMap<Integer, Integer>();

            for (int i = 0; i < numCase; i++) {
                line = br.readLine();
                String[] str = line.split(" ");

                int sMax = Integer.parseInt(str[0]);

                int len = str[1].length();
                int standupCount = 0;
                int needMoreCount = 0;
                for (int j = 0; j < len; j++) {
                    int count = Integer.parseInt(str[1].substring(j, j+1));
                    if (j == 0) {
                        standupCount += count;
                    } else {
                        if (standupCount >= j) {
                            standupCount += count;
                        } else {
                            needMoreCount += (j-standupCount);
                            standupCount += (count + (j-standupCount));
                        }
                    }
                }

                System.out.println(String.format("Case #%d: %s", i+1, needMoreCount));
            }



        } catch (Exception ex) {
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                }
            }
        }
    }
}
