package methodEmbedding.Speaking_in_Tongues.S.LYD317;

/* ==========================================================
 *  (C) Copyright 2007-present Facebook. All rights reserved.
 * ==========================================================
 */


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * .
 *
 * @author
 */
public class Translate {
    public static void main( String[] args ) throws NumberFormatException,
        IOException {
        final BufferedReader in =
            new BufferedReader( new FileReader(
                    "/Users/oded/a/ttt/src/in.txt" ) );
        final int numLines     = Integer.parseInt( in.readLine() );
        final List<String> raw = new ArrayList<String>( numLines );
        Map<Character, Character> translation =
            new HashMap<Character, Character>();
        translation.put( 'a', 'y' );
        translation.put( 'b', 'h' );
        translation.put( 'c', 'e' );
        translation.put( 'd', 's' );
        translation.put( 'e', 'o' );
        translation.put( 'f', 'c' );
        translation.put( 'g', 'v' );
        translation.put( 'h', 'x' );
        translation.put( 'i', 'd' );
        translation.put( 'j', 'u' );
        translation.put( 'k', 'i' );
        translation.put( 'l', 'g' );
        translation.put( 'm', 'l' );
        translation.put( 'n', 'b' );
        translation.put( 'o', 'k' );
        translation.put( 'p', 'r' );
        translation.put( 'q', 'z' );
        translation.put( 'r', 't' );
        translation.put( 's', 'n' );
        translation.put( 't', 'w' );
        translation.put( 'u', 'j' );
        translation.put( 'v', 'p' );
        translation.put( 'w', 'f' );
        translation.put( 'x', 'm' );
        translation.put( 'y', 'a' );
        translation.put( 'z', 'q' );
        translation.put( ' ', ' ' );

        for( int i = 0; i < numLines; i++ ) {
            String line = in.readLine();
            raw.add( line );
            System.out.print( "Case: #" + ( i + 1 ) + ": " );

            for( char c : line.toCharArray() ) {
                System.out.print( translation.get( c ) );
            }

            System.out.println();
        }
    }
}
