package methodEmbedding.Counting_Sheep.S.LYD1556;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Set;

public class Exercise1 {

    public static void main(String[] args) throws Exception {
//        String inputFileName = "input.in";
        String inputFileName = "A-small-attempt0.in";
        String outputFileName = "output.out";
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/manfcas/VCS2/Google Code Jam 2016/src/com/fairenoughsoftware/googlecodejam2016/" + inputFileName))) {
            int count = Integer.parseInt(br.readLine());
            FileWriter writer = new FileWriter("/Users/manfcas/VCS2/Google Code Jam 2016/src/com/fairenoughsoftware/googlecodejam2016/" + outputFileName);
            for (int i = 0; i < count; i++) {
                Set<Character> digits = new HashSet<>();
                String line = br.readLine();
                int n = Integer.valueOf(line);
                String result = "INSOMNIA";
                for (int j = 1; j < 100; j++) {
                    int product = n * j;
                    char[] chars = String.valueOf(product).toCharArray();
                    for (char c : chars) {
                        digits.add((char) (c - '0'));
                    }
                    if (digits.size() == 10) {
                        result = String.valueOf(product);
                        break;
                    }
                }
                writer.write("Case #" + (i + 1) + ": " + result + "\n");
            }
            writer.close();
        }
    }

}
