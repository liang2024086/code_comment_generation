package methodEmbedding.Revenge_of_the_Pancakes.S.LYD317;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Exercise2 {

    public static void main(String[] args) throws Exception {
        String inputFileName = "B-small-attempt0.in";
        String outputFileName = "output.out";
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/manfcas/VCS2/Google Code Jam 2016/src/com/fairenoughsoftware/googlecodejam2016/exercise2/" + inputFileName))) {
            int count = Integer.parseInt(br.readLine());
            FileWriter writer = new FileWriter("/Users/manfcas/VCS2/Google Code Jam 2016/src/com/fairenoughsoftware/googlecodejam2016/exercise2/" + outputFileName);
            for (int i = 0; i < count; i++) {
                String line = br.readLine();
                char[] chars = line.toCharArray();
                int flips = chars[chars.length - 1] == '+' ? 0 : 1;
                for (int j = chars.length - 2; 0 <= j; j--) {
                    if (chars[j] != chars[j + 1]) {
                        flips++;
                    }
                }
                writer.write("Case #" + (i + 1) + ": " + flips + "\n");
            }
            writer.close();
        }
    }

}
