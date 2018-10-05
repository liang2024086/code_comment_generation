package methodEmbedding.Magic_Trick.S.LYD758;

// By Patrick Mead
// patrick+codejam@meadia.com.au

// Takes one argument: The name of the input file
// Outputs to the same filename but with a .out extension.

import java.io.*;
import java.util.*;

public class MagicTrick {
    private static Scanner in;
    private static PrintStream out;

    public static void main(String[] args) throws FileNotFoundException {
        
        in = new Scanner(new FileReader(new File(args[0]))); // Instantiate a Scanner for input
        out = new PrintStream(new FileOutputStream(new File( // And a PrintStream for output
            args[0].replaceFirst("(\\.in)?$", ".out"))       // Change .in extension (if it exists) to .out
        ));

        int t = in.nextInt();
        in.nextLine();
        
        for (int testCase = 1; testCase <= t; testCase++) {
            out.print("Case #" + testCase + ": ");
            
            boolean[] cards = new boolean[16];
            
            int line = in.nextInt();
            in.nextLine();
            for( int l = 1; l <= 4; ++l ){
                for( int i = 0; i < 4; ++i ){
                    int card = in.nextInt();
                    if( l == line ){
                        cards[ card - 1 ] = true;
                        System.out.print( card + " " );
                    }
                }
                in.nextLine();
            }
            System.out.println();

            line = in.nextInt();
            in.nextLine();
            for( int l = 1; l <= 4; ++l ){
                for( int i = 0; i < 4; ++i ){
                    int card = in.nextInt();
                    if( l == line ){
                        cards[ card - 1 ] &= true;
                        System.out.print( card + " " );
                    }else{
                        cards[ card - 1 ] = false;
                    }
                }
                in.nextLine();
            }
            System.out.println();
            
            int card = 0, numMatches = 0;
            for( int i = 0; i < 16; ++i ){
                if( cards[i] ){
                    card = i + 1;
                    ++numMatches;
                    System.out.print( card + " " );
                }
            }
            System.out.println();
            System.out.println();
            
            switch( numMatches ){
                case 0:  out.println( "Volunteer cheated!" ); break;
                case 1:  out.println( card                 ); break;
                default: out.println( "Bad magician!"      ); break;
            }
        }
        
        //System.out.println("Done!");
        
    }
    
}
