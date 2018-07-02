package methodEmbedding.Standing_Ovation.S.LYD642;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main1 {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/manfcas/VCS/GoogleCodeJam2015/lib/src/main/java/com/fairenoughsoftware/A-small-attempt0.in"))) {
            int count = Integer.parseInt(br.readLine());
            FileWriter writer = new FileWriter("/Users/manfcas/VCS/GoogleCodeJam2015/lib/src/main/java/com/fairenoughsoftware/output1.txt");
            for (int i = 0; i < count; i++) {
                String line = br.readLine();
                String[] split = line.split(" ");
//                int levels = Integer.parseInt(split[0]);
                String s2 = split[1];
                char[] chars = s2.toCharArray();
                int[] digits = new int[chars.length];
                for (int j = 0; j < digits.length; j++)
                    digits[j] = Integer.parseInt("" + chars[j]);
                int standing = 0;
                int friends = 0;
                for (int level = 0; level < digits.length; level++) {
                    Integer countForLevel = digits[level];
                    if (standing < level) {
                        friends += level - standing;
                        standing += level - standing;
                    }
                    standing += countForLevel;
                }
                writer.write("Case #" + (i + 1) + ": " + friends + "\n");
            }
            writer.close();
        }
    }

}
