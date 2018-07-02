package methodEmbedding.Revenge_of_the_Pancakes.S.LYD83;


import java.io.File;
import java.util.Scanner;
import java.util.stream.IntStream;

public class two {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Scanner s = new Scanner(two.class.getResourceAsStream("input.in"));

        int Ts = s.nextInt();
        for( int t : IntStream.rangeClosed(1, Ts).toArray() ) {
            char[] S = s.next().toCharArray();
            if( S.length == 0 ) {
                System.out.printf("Case #%d: %d\n", t, 0);
                continue;
            }


            int countSad = 0;
            boolean lastIsSad = false;
            for( char c : S ) {
                boolean isSad = '-' == c;
                if( isSad && !lastIsSad ) {
                    countSad++;
                }
                lastIsSad = isSad;
            }

            int result = 2 * countSad;
            if( S[0] == '-' ) result--;
            System.out.printf("Case #%d: %d\n", t, result);
        }
    }
}
