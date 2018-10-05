package methodEmbedding.Counting_Sheep.S.LYD479;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Alvin on 4/9/2016.
 */
public class CodeJam2016_A_CountingSheep {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("A-small-attempt0.in"));
        int count = input.nextInt();
        for (int i = 0; i < count; i++) {
            int starting = input.nextInt();
            String convert = starting + "";
            HashSet<Integer> seen = new HashSet<>();
            for (int j = 0; j < convert.length(); j++) {
                seen.add((int)convert.charAt(j));
            }
            int factor = 2;
            while(seen.size() < 10) {
                String newConvert = (starting * factor) + "";
                for (int j = 0; j < newConvert.length(); j++) {
                    seen.add((int)newConvert.charAt(j));
                }
                if((starting * factor) == starting) {
                    System.out.println("Case #" + (i+1) + ": INSOMNIA");
                    break;
                } else if(seen.size() >= 10) {
                    System.out.println("Case #" + (i+1) + ": " + (starting * factor));
                    break;
                }
                factor++;
            }
        }
    }
}
