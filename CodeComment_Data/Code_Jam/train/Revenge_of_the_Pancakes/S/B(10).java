package methodEmbedding.Revenge_of_the_Pancakes.S.LYD545;


import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by Adi on 4/8/2016.
 */
public class B {

    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("codejam/B/B-small-attempt0.in");
        System.setIn(is);
        Scanner in = new Scanner(System.in);
        int numCases = in.nextInt();
        for (int i = 1; i < numCases + 1; i++) {
            String pancakes = in.next();
            int flips = 0;
            if (pancakes.length() == 1) {
                flips = 1;
            } else {
                for (int j = 1; j < pancakes.length(); j++) {
                    if (pancakes.charAt(j) != pancakes.charAt(j-1)) {
                        flips += 1;
                    }
                }
                flips += 1;
            }
            if (pancakes.charAt(pancakes.length() - 1) == '+') {
                flips -= 1;
            }
            System.out.println(String.format("Case #%s: %s", i, flips));
        }
    }

}
