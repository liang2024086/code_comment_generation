package methodEmbedding.Standing_Ovation.S.LYD775;

import java.io.*;

public class A {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\radug\\IdeaProjects\\CodeJam\\2015\\A-small-attempt0.in")));
             BufferedWriter writer = new BufferedWriter(new FileWriter(new File("C:\\Users\\radug\\IdeaProjects\\CodeJam\\2015\\A.out")))) {
            int tests = Integer.parseInt(reader.readLine().trim());
            int testCase = 0;

            while (tests-- > 0) {
                String line = reader.readLine().trim();
                int idx = line.indexOf(' ');
                int size = Integer.parseInt(line.substring(0, idx));
                String strAudience = line.substring(idx + 1);
                int sum = 0;
                int friends = 0;

                for (int i = 0; i <= size; ++i) {
                    int audience = strAudience.charAt(i) - '0';
                    int friendsThisTurn = 0;

                    if (sum < i) {
                        friendsThisTurn = i - sum;
                    }

                    sum += audience + friendsThisTurn;
                    friends += friendsThisTurn;
                }

                if (testCase > 0) {
                    writer.newLine();
                }

                writer.write(String.format("Case #%d: %d", (++testCase), friends));
            }
        } catch (IOException e) {
            // nothing to do
        }
    }
}
