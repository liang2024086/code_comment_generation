package methodEmbedding.Standing_Ovation.S.LYD279;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StandingOvation {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            int cases = Integer.parseInt(br.readLine());

            for (int i = 1; i < cases + 1; i++) {
                String[] line = br.readLine().replaceAll("\\s","").split("");
                int smax = Integer.parseInt(line[0]);
                int[] cumnums = new int[smax + 1];
                int friends = 0;

                cumnums[0] = Integer.parseInt(line[1]);
                for (int j = 1; j < smax + 1; j++) {
                    cumnums[j] = cumnums[j-1] + Integer.parseInt(line[j+1]);
                    if (j > cumnums[j-1] + friends) {
                        friends++;
                    }
                }

                System.out.println("Case #" + i + ": " + friends);
            }

        } catch (IOException e) {
            System.out.println("Reading failed");
        }
    }
}
