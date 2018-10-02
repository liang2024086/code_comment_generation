package methodEmbedding.Magic_Trick.S.LYD1329;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MagicTrick {
    public static void main(String[] args) {
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get("./magic-trick.in.txt"), Charset.forName("US-ASCII"));
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("./magic-trick.out.txt"), Charset.forName("US-ASCII"));
            int T = Integer.parseInt(reader.readLine());
            for (int t = 1; t <= T; t++) {
                int row1;
                int row2;
                List<List<Integer>> cards1 = new ArrayList<>(4);
                List<List<Integer>> cards2 = new ArrayList<>(4);

                row1 = Integer.parseInt(reader.readLine()) - 1;
                for (int i = 0; i < 4; i++) {
                    List<Integer> thisRow = new ArrayList<>(4);
                    String[] parts = reader.readLine().split(" ");
                    for (String part : parts) {
                        thisRow.add(Integer.parseInt(part));
                    }
                    cards1.add(thisRow);
                }
                row2 = Integer.parseInt(reader.readLine()) - 1;
                for (int i = 0; i < 4; i++) {
                    List<Integer> thisRow = new ArrayList<>(4);
                    String[] parts = reader.readLine().split(" ");
                    for (String part : parts) {
                        thisRow.add(Integer.parseInt(part));
                    }
                    cards2.add(thisRow);
                }
                List<Integer> inCommon = new ArrayList<>(4);
                for (Integer i : cards1.get(row1)) {
                    if (cards2.get(row2).contains(i)) {
                        inCommon.add(i);
                    }
                }
                String result;
                if (inCommon.isEmpty()) {
                    result = "Volunteer cheated!";
                } else if (inCommon.size() == 1) {
                    result = inCommon.get(0).toString();
                } else {
                    result = "Bad magician!";
                }
                writer.write(String.format("Case #%s: %s", t, result));
                writer.newLine();
            }
            writer.close();
            reader.close();
        } catch (IOException e) {

        }
    }
}
