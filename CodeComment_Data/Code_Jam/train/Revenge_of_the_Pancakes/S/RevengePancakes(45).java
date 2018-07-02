package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1154;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class RevengePancakes {
    public static void main(String[] args) throws Exception {
        String inputFile = "test.txt";
        BufferedReader br = new BufferedReader(new FileReader(new File(inputFile)));
        String line;
        int caseNum = 0;
        int counter = 0;
        while ((line = br.readLine()) != null) {
            if (caseNum == 0) {
                caseNum = Integer.parseInt(line);
                continue;
            } else {
                counter++;
            }
            int[] cakes = new int[line.length()];
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '+') {
                    cakes[i] = 1;
                } else {
                    cakes[i] = 0;
                }
            }
            int numFlips = 0;
            for (int i = (cakes.length - 1); i >= 0; i--) {
                // if its 1, then we can ignore that end
                if (cakes[i] == 0) {
                    // a 1 will turn into a 0 when flipped
                    if (cakes[0] == 1) {
                        int c = 0;
                        numFlips++;
                        while (c < i && cakes[c] == 1) {
                            cakes[c] = 0;
                            c++;
                        }
                    }

                    // a 0 will turn into a 1 which is good
                    numFlips++;
                    int[] temp = new int[i + 1];
                    for (int j = 0; j < temp.length; j++) {
                        temp[j] = cakes[i - j];
                    }
                    for (int j = 0; j < temp.length; j++) {
                        if (temp[j] == 1) {
                            cakes[j] = 0;
                        } else {
                            cakes[j] = 1;
                        }
                    }

                }
            }
            System.out.format("Case #%d: %d\n", counter, numFlips);
        }
        br.close();
    }
}
