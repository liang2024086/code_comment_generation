package methodEmbedding.Speaking_in_Tongues.S.LYD321;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

public class A {
	//                    abcdefghijklmnopqrstuvwxyz 
	static char[] code = "yhesocvxduiglbkrztnwjpfmaq".toCharArray();
	/**
	 * @param args
	 */
	public static void main( String[] args ) {
		try {
			String fileName = "A-small-attempt0";// "A-test";// "A-large";// 
			BufferedReader inFile = new BufferedReader( new FileReader(
					new File( fileName+".in" ) ) );
			PrintStream outFile = new PrintStream(
					new FileOutputStream( fileName+".out" ));

			String line = inFile.readLine();
			int tests = Integer.parseInt( line );
			for (int test = 0; test < tests; test++) {
				line = inFile.readLine();
				char[] sg = line.toCharArray();
				char[] sn = new char[sg.length];
				for ( int i = 0; i < sg.length; i++ ) {
						sn[i] = sg[i] != ' ' ? code[sg[i]-'a'] : ' ';
				}
				outFile.println( "Case #" + (test+1) + ": " + new String(sn) );
			}
			inFile.close();
			outFile.close();

		} catch ( IOException e ) {
			e.printStackTrace();
		}
	}

}


