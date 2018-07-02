package methodEmbedding.Counting_Sheep.S.LYD856;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.BitSet;
import java.util.Scanner;
import java.io.PrintWriter;

public class Task {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader("/Users/nluengna/Downloads/A-small-attempt0.in")));
        int t = scanner.nextInt();
        for (int i=0; i<t; i++) {
            long n = scanner.nextInt();
            int MAX = 1000;
            BitSet bitset = new BitSet();
            if (n<0) {
                n = -n;
            }
            if (n==0) {
                System.out.println("Case #" + (i+1) + ": INSOMNIA");
            } else {
                long v = n;
                boolean found = false;
                int j;
                for (j=0; j<MAX; j++) {
                    long x = v;
                    while (x > 0) {
                        int m = (int)(x%10);
                        bitset.set(m);
                        if (bitset.cardinality()==10) {
                            found = true;
                            break;
                        }
                        x /= 10;
                    }
                    if (found) {
                        break;
                    }
                    v += n;
                }
                if (found) {
                    System.out.println("Case #" + (i+1) + ": " + v);
                } else {
                    System.out.println("Case #" + (i+1) + ": INSOMNIA");
                }
            }
        }
    }
}
