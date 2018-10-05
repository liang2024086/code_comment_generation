package methodEmbedding.Standing_Ovation.S.LYD281;

/**
 * Created by Ashley on 4/10/15.
 */
import java.util.*;
public class opera {

    public static void main(String[] args) {
        int friends = 0;
        int currentstand = 0;
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        for (int i = 0; i < cases; i++) {

            int audience = scan.nextInt();
            String numbers = scan.next();
            char[] chararray = numbers.toCharArray();

            for (int j = 0; j < chararray.length; j++) {
                // System.out.print(chararray[j]);
                //friends += Character.digit(chararray[j], 10);
                if (currentstand >= j) {
                    currentstand += Character.digit(chararray[j], 10);
                } else {
                    friends += (j - currentstand);
                    currentstand += (j - currentstand);
                    currentstand += Character.digit(chararray[j], 10);
                }

            }


            System.out.println("Case #" + (i + 1) + ": " + friends);
            currentstand = 0;
            friends = 0;
        }


    }

}
