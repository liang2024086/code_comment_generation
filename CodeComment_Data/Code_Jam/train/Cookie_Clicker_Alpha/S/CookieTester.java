package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1308;

import java.io.File;
import java.io.FileNotFoundException;

//***********************************
//
// Bill Toth's Cookie Clicker Alpha
// for google code jam 2014
// problem B
// 
//***********************************


public class CookieTester {

	public static void main(String[] args) throws FileNotFoundException {
		File inputFile = new File(args[0]);
		CookieClicker c = new CookieClicker(inputFile);
		c.evaluate();
	}

}
