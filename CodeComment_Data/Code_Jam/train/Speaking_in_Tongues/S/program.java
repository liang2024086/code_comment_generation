package methodEmbedding.Speaking_in_Tongues.S.LYD1539;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class program {

	/**
	 * @param args
	 * 
	 * Reads the input file for test cases.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile = new File("/home/kolive/Programming/GoogleCodeJam_2012/in");
		
		
		try {
			BufferedReader myReader = new BufferedReader(new FileReader(inFile));
			String tmp = "";
			int i = 1;
			tmp = myReader.readLine();
			while( (tmp = myReader.readLine()) != null)
			{
				
				System.out.print("\nCase #" + i + ": " + ProblemA.translateString(tmp));
				i++;
			}


		} catch (IOException e) {
			System.out.println("Exception Caught: " + e);
		}
	}

}
