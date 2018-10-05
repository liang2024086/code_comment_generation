package methodEmbedding.Magic_Trick.S.LYD1464;

//**************************************
//This is Bill Toth's solution to
//problem A of the 2014 Google Code Jam
//
//
//**************************************

import java.io.File;
import java.io.FileNotFoundException;

public class trickTester {

	public static void main(String[] args) throws FileNotFoundException{
		File inputFile = new File(args[0]);
		MagicTrick m = new MagicTrick(inputFile);
		m.evaluate();


	}
}
