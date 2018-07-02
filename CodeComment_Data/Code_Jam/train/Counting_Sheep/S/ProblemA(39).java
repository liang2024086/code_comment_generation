package methodEmbedding.Counting_Sheep.S.LYD1435;

import java.io.*;

/**
 * Created by andrei on 09.04.2016.
 */
public class ProblemA {


    public static void main( String[] args ) throws IOException {

        FileInputStream fis = new FileInputStream("/home/andrei/Desktop/input.in");
        BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

        PrintWriter writer = new PrintWriter("/home/andrei/Desktop/output.out", "UTF-8");

        long t, currentNumber;
        t = Long.valueOf( reader.readLine() );

        for (int k = 1; k <= t; ++k ) {
            currentNumber = Long.valueOf( reader.readLine() );
            if (currentNumber == 0) {
                writer.println( "Case #" + k + ": INSOMNIA" );
                continue;
            }
            boolean[] digits = new boolean[ 10 ];
            int digitsFound = 0;
            for ( long multiplier = 1; ; ++multiplier ) {
                long copyN = multiplier * currentNumber;
                while ( copyN > 0 ) {
                    int lastDigit = ( int ) ( copyN % 10 );
                    if ( digits[ lastDigit ] == false ) {
                        digitsFound++;
                        digits[ lastDigit ] = true;
                    }
                    copyN /= 10;
                }
                if ( digitsFound == 10 ) {
                    writer.println( "Case #" + k + ": " + currentNumber * multiplier );
                    break;
                }
            }
        }
        writer.close();
    }
}
