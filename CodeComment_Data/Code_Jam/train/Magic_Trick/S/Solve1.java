package methodEmbedding.Magic_Trick.S.LYD461;

import java.io.*;
public class Solve1 {
  public static void main ( String[] args ) {
    try {
      BufferedReader buf = new BufferedReader( new InputStreamReader( new FileInputStream( args[0] ) ) );
      int count = Integer.parseInt( buf.readLine() );
      int number = 0;
      int matches = 0;
      int row;
      String[] numbers0 = {}; 
      String[] numbers1 = {};
      for ( int i = 0; i < count; i++ ) {
	System.out.print( "Case #" +  ( i + 1 ) + ": " );
	matches = 0;
	number = 0;
	row = Integer.parseInt( buf.readLine() );
	for ( int j = 0; j < 4; j++ ) {
	  if ( j + 1 == row ) {
	    numbers0 = buf.readLine().trim().split( " " );
	  }
	  else {
	    buf.readLine();
	  }
	}
	row = Integer.parseInt( buf.readLine() );
	for ( int j = 0; j < 4; j++ ) {
	  if ( j + 1 == row ) {
	    numbers1 = buf.readLine().trim().split( " " );
	  }
	  else {
	    buf.readLine();
	  }
	}
	for ( int j = 0; j < 4; j++ ) {
	  for ( int k = 0; k < 4; k++ ) {
	    if ( numbers0[j].equals( numbers1[k] ) ) {
	      matches ++;
	      number = Integer.parseInt( numbers1[k] );
	    }
	  }
	}
	if ( matches == 0 ) {
	  System.out.println( "Volunteer cheated!" );
	}
	if ( matches == 1 ) {
	  System.out.println( number );
	}
	if ( matches > 1 ) {
	  System.out.println( "Bad magician!" );
	}
      }
    }
    catch ( Exception e ) {
      e.printStackTrace();
    }
  }
}
