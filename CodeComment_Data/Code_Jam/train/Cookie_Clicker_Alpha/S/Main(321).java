package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1406;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import problems.b.CookieClickerAlpha;


public class Main {

	/**
	 * @param args
	 */
	public static void main( String[] args ) {
        List< String > input;
		try {
			input = Files.readAllLines( Paths.get( "C:/CodeJam2014/CookieClicker/B-small-attempt0.in" ), Charset.defaultCharset());			
	        String result = CookieClickerAlpha.solve( input );
	        System.out.println(result);
		} catch ( IOException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
