package methodEmbedding.Cookie_Clicker_Alpha.S.LYD162;

import java.io.IOException;
import java.util.ArrayList;


public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String in = "C:\\Users\\Zach\\Documents\\Zach\'s Stuff\\Programs\\Text Files\\B-small-attempt0.in";
		final String out = "C:\\Users\\Zach\\Documents\\Zach\'s Stuff\\Programs\\Text Files\\CookieClickerOut.txt";
		ReadWithScanner reader = new ReadWithScanner(in);
		ReadWithScanner writer = new ReadWithScanner(out);
		ArrayList<String> input = null;
		
		try {
			input = reader.readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CookieClicker macadamia = new CookieClicker(input);
		macadamia.writeOutput(writer);
		
	}

}
