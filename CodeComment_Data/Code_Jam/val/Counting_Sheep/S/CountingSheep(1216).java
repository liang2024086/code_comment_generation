package methodEmbedding.Counting_Sheep.S.LYD1673;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by slycer on 4/1/16.
 */
public class CountingSheep {

    public static void main ( String [] args ) throws FileNotFoundException {
        System.setOut( new PrintStream( "CountingSheep.out" ));
        Scanner s = new Scanner( System.in ) ;
        int tests = s.nextInt();
        for ( int  test=1; test<=tests; test++ ){

            long n = s.nextLong();
            if ( n == 0 ){
                System.err.println( "Case #"+test + ": INSOMNIA" );
                System.out.println( "Case #"+test + ": INSOMNIA" );
                continue;
            }
            int notSeen = 10;
            boolean [] seen = new boolean[10];
            long answer = 0;
            for ( long i=1; ; i++ ){
                long aux = n * i ;
                answer = aux;
                while ( aux>0){
                    int digit = (int)(aux%10);
                    if ( seen[digit] == false){
                        notSeen--;
                        seen[digit] = true;
                    }
                    aux = aux/10;
                }
                if ( notSeen == 0 ){
                    break;
                }
            }

            System.err.println("Case #"+test + ": " + answer );
            System.out.println("Case #"+test + ": " + answer );
        }
    }

}
