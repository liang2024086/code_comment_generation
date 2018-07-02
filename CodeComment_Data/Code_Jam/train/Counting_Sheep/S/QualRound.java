package methodEmbedding.Counting_Sheep.S.LYD242;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author AbdulBasit KABIR
 */
public class QualRound {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // read t
        String y = "";
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            if (n == 0) {
                y = "INSOMNIA";
            } else {
                int count = 2;
                int number = n;
                Set<Character> set = new HashSet<>(0);
                do {
                    // the line call toObject() method of org.apache.commons.lang3.ArrayUtils
                    //available at http://commons.apache.org/proper/commons-lang/download_lang.cgi
                    //maven: org.apache.commons:commons-lang3:3.4
                    Character[] digits1 = ArrayUtils.toObject((number + "").toCharArray());
                    set.addAll(Arrays.asList(digits1));

                    y = number + "";
                    number = n * count++;

                } while (set.size() != 10);
            }

            System.out.println("Case #" + i + ": " + y); //print case#X
        }
    }

}
