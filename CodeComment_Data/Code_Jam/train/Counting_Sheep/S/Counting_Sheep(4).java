package methodEmbedding.Counting_Sheep.S.LYD413;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Counting_Sheep {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Set s;
        BufferedReader br = new BufferedReader(new FileReader("/Users/nannapan/NetBeansProjects/JavaLibrary1/src/people/A-small-attempt0.in"));
        int n = Integer.parseInt(br.readLine());
        PrintWriter writer = new PrintWriter("/Users/nannapan/NetBeansProjects/JavaLibrary1/src/people/A-small.out", "UTF-8");
        for (int i = 0; i < n; i++) {
            s = new HashSet<Character>();
            BigInteger num = new BigInteger(br.readLine());
            BigInteger num1 = BigInteger.ZERO;
            System.out.println(num.toString());
            if (num.compareTo(BigInteger.ZERO) == 0) {
                writer.println("CASE #" + (i + 1) + ": INSOMNIA");
                continue;
            }
            for (long j = 1; s.size() < 10; j++) {

                num1 = num.multiply(BigInteger.valueOf(j));
                String dig = num1.toString();
                System.out.println(dig);
                for (int k = 0; k < dig.length(); k++) {
                    s.add(dig.charAt(k));
                }
                System.out.println(s.toString());
            }
            writer.println("CASE #" + (i + 1) + ": " + num1.toString());
        }
        writer.close();
    }
}
