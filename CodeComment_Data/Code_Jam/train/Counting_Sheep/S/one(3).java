package methodEmbedding.Counting_Sheep.S.LYD619;


import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class one {
    public static void main( String[] args ) throws FileNotFoundException {
        //Scanner s = new Scanner("6\n0\n1\n2\n3\n4\n5\n");
        Scanner s = new Scanner(new File("input.in"));
        int t = s.nextInt();

        for( int i = 0; i < t; i ++ ) {
            Set<Character> l = new HashSet<Character>();
            BigInteger b = s.nextBigInteger();
            if( b.equals(BigInteger.ZERO) ) {
                    System.out.printf("Case #%d: INSOMNIA\n", i+1);
                    continue;
                }

                BigInteger c = b;
                int m = 2;
                while( true ) {
                    for (char ch : c.toString().toCharArray()) {
                        l.add(ch);
                    }
                    if (l.size() == 10) {
                    System.out.printf("Case #%d: %s\n", i + 1, c);
                    break;
                }
                c = b.multiply(BigInteger.valueOf(m));
                m++;
                if( m > 200 ) {
                    // give up
                    System.out.printf("Case #%d: INSOMNIA\n", i + 1);
                    break;
                }
            }


        }
    }
}
