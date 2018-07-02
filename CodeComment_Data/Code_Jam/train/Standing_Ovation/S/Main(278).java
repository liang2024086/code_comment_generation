package methodEmbedding.Standing_Ovation.S.LYD1614;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/Users/mesuterhanunal/Desktop/input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/mesuterhanunal/Desktop/output.txt"));

            int totalCase = Integer.parseInt(br.readLine());

            for (int i = 0; i < totalCase; i++) {
                String [] tempLine = br.readLine().split("\\s+");
                String info = tempLine[1];
                int maxShy = Integer.parseInt(tempLine[0]);
                int neededPerson = 0, weGot = 0;

                for (int j = 0; j <= maxShy; ) {
                    if (weGot >= j) {
                        weGot += Character.getNumericValue(info.charAt(j));
                        j++;
                    }

                    else {
                        weGot += 1;
                        neededPerson += 1;
                        continue;
                    }
                }

                bw.write("Case #" + (i+1) + ": " + neededPerson + "\n");
            }

            br.close();
            bw.close();
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
