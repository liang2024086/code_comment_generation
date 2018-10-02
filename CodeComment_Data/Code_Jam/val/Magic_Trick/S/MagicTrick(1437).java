package methodEmbedding.Magic_Trick.S.LYD1202;


import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MagicTrick {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new FileReader("C:\\\\Users\\\\radu\\\\IdeaProjects\\\\GoogleCodeJam\\\\input.txt"))) {
            int numTests = sc.nextInt();

            for (int i = 0; i < numTests; i++) {
                Map<Integer, Integer> items = new HashMap<>();

                for (int j = 0; j < 2; j++) {
                    int row = sc.nextInt();

                    for (int k = 1; k <= 4; k++) {
                        for (int l = 0; l < 4; l++) {
                            if (k == row) {
                                int value = sc.nextInt();
                                Integer count = items.get(value);

                                count = count == null ? 0 : count;
                                items.put(value, count + 1);
                            } else {
                                sc.nextInt();
                            }
                        }
                    }
                }

                int numGoodValues = 0;
                int card = -1;

                for (Map.Entry<Integer, Integer> entry : items.entrySet()) {
                    if (entry.getValue() == 2) {
                        numGoodValues += 1;
                        card = entry.getKey();
                    }
                }

                if (numGoodValues == 0) {
                    System.out.println(String.format("Case #%d: %s", i + 1, "Volunteer cheated!"));
                } else if (numGoodValues > 1) {
                    System.out.println(String.format("Case #%d: %s", i + 1, "Bad magician!"));
                } else {
                    System.out.println(String.format("Case #%d: %d", i + 1, card));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
