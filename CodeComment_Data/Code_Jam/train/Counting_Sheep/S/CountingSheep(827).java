package methodEmbedding.Counting_Sheep.S.LYD1681;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CountingSheep {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("/home/mbroshi/Downloads/A-small-attempt0.in"));
        int numCases = sc.nextInt();
        StringBuffer output = new StringBuffer();
        for (int i = 1; i <= numCases; i++) {
            BigInteger N = BigInteger.valueOf(sc.nextInt());
            String count;
            if (N.equals(BigInteger.ZERO)) {
                count = "INSOMNIA";
            } else {
                BigInteger number = BigInteger.ZERO;
                BigInteger multiple = number;
                List<String> notSeen = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
                while (!notSeen.isEmpty()) {
                    number = number.add(BigInteger.ONE);
                    multiple = number.multiply(N);
                    for (Iterator<String> iterator = notSeen.iterator(); iterator.hasNext(); ) {
                        String string = iterator.next();
                        if (multiple.toString().contains(string)) {
                            iterator.remove();
                        }
                    }
                }
                count = multiple.toString();
            }
            output.append(String.format("Case #%d: %s\n", i, count));
        }
        System.out.println(output);
        FileWriter fw = new FileWriter(new File("/home/mbroshi/Downloads/A-small-attempt0.out"));
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(output.toString());
        bw.close();
    }

}
