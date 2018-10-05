package methodEmbedding.Standing_Ovation.S.LYD1539;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by slycer on 4/11/15.
 */
public class StandingOvation {

    public static void main ( String [] arg ) throws FileNotFoundException {

        System.setOut( new PrintStream( "standingOvation.out" ) );
        Scanner s = new Scanner ( System.in );

        int cases = s.nextInt();
        for ( int c=1; c<=cases; c++ ){
            int n = s.nextInt();
            String string = s.next();
            int [] data = new int[n+1];
            for ( int i=0; i <= n; i++ ){
                data[i] = Integer.valueOf( string.charAt(i) + "" );
            }
            int standing = 0;
            int extra = 0;
            int sol = 0;
            for ( int i=0; i<=n; i++ ){
                if ( standing<i ){
                    extra = i - standing;
                    standing += extra;
                    sol += extra;
                }
                standing += data[i];
            }
            System.out.println( "Case #" + c + ": " + sol  );
        }

    }

}
