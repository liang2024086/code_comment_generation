package methodEmbedding.Magic_Trick.S.LYD2157;

import java.io.IOException;
import java.util.ArrayList;


public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String in = "C:\\Users\\Zach\\Documents\\Zach\'s Stuff\\Programs\\Text Files\\A-small-attempt1.in";
		final String out = "C:\\Users\\Zach\\Documents\\Zach\'s Stuff\\Programs\\Text Files\\MagicTrickOut.txt";
		ReadWithScanner reader = new ReadWithScanner(in);
		ReadWithScanner writer = new ReadWithScanner(out);
		ArrayList<String> input = null;
		try {
			input = reader.readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MagicTrick trick = new MagicTrick(input);
		
		trick.writeOutput(writer);

	}

}
