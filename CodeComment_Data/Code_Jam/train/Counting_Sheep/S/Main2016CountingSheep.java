package methodEmbedding.Counting_Sheep.S.LYD1650;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by dx on 3/30/16.
 */
public class Main2016CountingSheep {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        Long t = Long.parseUnsignedLong(in.nextLine());
        for (int i = 1; i <= t; ++i) {
            Boolean[] seen = new Boolean[10];
            Arrays.fill(seen, false);

            int j = 1;
            BigInteger n = in.nextBigInteger();
            if(n.toString().equals("0")) {
                System.out.print("Case #" + i + ": INSOMNIA" );
            }
            else {
                BigInteger x = BigInteger.ZERO;
                while(Arrays.asList(seen).contains(false)) {
                    x = n.multiply(new BigInteger("" + j++));
                    String nsf = x.toString();
                    String[] ns = nsf.split("", -1);
                    for(String nse : ns) {
                        if(nse.length() == 0) continue;
                        Integer toInt = Integer.parseInt(nse);
                        seen[toInt] = true;
                    }
                }

                System.out.print("Case #" + i + ": " + x.toString() );
            }
            System.out.println();
        }
    }

}
