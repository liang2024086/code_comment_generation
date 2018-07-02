package methodEmbedding.Magic_Trick.S.LYD274;

import java.io.*;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class A {
    private static final String ANSWER = "Case #{0}: {1}";
    private static final String BAD_MAG = "Bad magician!";
    private static final String CHEATER = "Volunteer cheated!";

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("a.in")));
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("a.out")));
            int num = Integer.parseInt(reader.readLine().trim());
            for (int i = 0; i < num; i++) {
                int firstAnswer = Integer.parseInt(reader.readLine().trim()) - 1;
                List<String> cards = new ArrayList<String>();
                for (int j = 0; j < 4; ++j) {
                    String line1 = reader.readLine();
                    if (j == firstAnswer) {
                        String[] strs = line1.trim().split(" +");
                        for (int k = 0; k < strs.length; ++k) {
                            cards.add(strs[k]);
                        }
                    }
                }
                int secondAnswer = Integer.parseInt(reader.readLine().trim()) - 1;
                int matches = 0;
                int result = 0;
                for (int j = 0; j < 4; ++j) {
                    String line1 = reader.readLine();
                    if (j == secondAnswer) {
                        String[] strs = line1.trim().split(" +");
                        for (int k = 0; k < strs.length; ++k) {
                            if (cards.contains(strs[k])) {
                                matches++;
                                result = Integer.parseInt(strs[k]);
                            }
                        }
                    }
                }
                if (matches == 0) {
                    writer.write(MessageFormat.format(ANSWER, i + 1, CHEATER));
                } else if (matches == 1) {
                    writer.write(MessageFormat.format(ANSWER, i + 1, result));
                } else {
                    writer.write(MessageFormat.format(ANSWER, i + 1, BAD_MAG));
                }
                writer.newLine();
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
