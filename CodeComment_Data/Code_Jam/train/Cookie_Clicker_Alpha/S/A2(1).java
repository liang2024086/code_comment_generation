package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1246;

/* ==========================================================
 *  (C) Copyright 2007-present Facebook. All rights reserved.
 * ==========================================================
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * .
 *
 * @author
 */
public class A2 {
    private static int a = 0;

    public static void main( String[] args ) throws Exception {
        final FileReader fr =
            new FileReader( new File( "/Users/oded/codejam/a.in" ) );
        final BufferedReader br     = new BufferedReader( fr );
        FileWriter           writer =
            new FileWriter( new File( "/Users/oded/codejam/a.out" ) );
        final BufferedWriter bw       = new BufferedWriter( writer );
        final int            numCases = Integer.parseInt( br.readLine() );

        for( int i = 1; i <= numCases; i++ ) {
            final String   s     = br.readLine();
            final String[] split = s.split( " " );
            final double   C     = Double.parseDouble( split[ 0 ] );
            final double   F     = Double.parseDouble( split[ 1 ] );
            final double   X     = Double.parseDouble( split[ 2 ] );

            double cr   = 2.0;
            double time = 0.0;

            double solution = 0;
            double optimal  = Double.MAX_VALUE;

            while( optimal > time + X / cr ) {
                optimal = time + X / cr;
                time    = time + C / cr;
                cr      = cr + F;
            }

            bw.write( "Case #" + i + ": " + optimal + "\n" );
            System.out.println( s );
            System.out.println( "Case #" + i + ": " + optimal );
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
