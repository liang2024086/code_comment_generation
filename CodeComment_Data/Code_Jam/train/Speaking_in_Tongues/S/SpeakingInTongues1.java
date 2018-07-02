package methodEmbedding.Speaking_in_Tongues.S.LYD46;

import java.io.*;
import java.util.*;

public class SpeakingInTongues1 {
	public static void main( String[] args ) throws Throwable {
		String str = "yhesocvxduiglbkrztnwjpfmaq".toUpperCase();
	    Scanner in = new Scanner( System.in );
	    int T = Integer.parseInt( in.nextLine() );
	    
	    for( int z = 1; z <= T; z++ ) {
	    	String s = in.nextLine();
	    	
	    	for( int i = 0; i < 26; i++ ) {
	    		s = s.replace( (char)('a'+i), str.charAt( i ) );
	    	}
	    	
	    	System.out.println( "Case #" + z + ": " + s.toLowerCase() );
	    }
    }
}
