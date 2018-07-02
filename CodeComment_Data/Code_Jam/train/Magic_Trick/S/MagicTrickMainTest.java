package methodEmbedding.Magic_Trick.S.LYD88;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 * 
 * @author sidi
 * @version 2014-04-12
 */
public class MagicTrickMainTest {

	public static void main(String[] args) {
		
		String inputFile = "A-small-attempt0.in";
		String outputFile = "A-small-attempt0.out";
		
		int numTests = -1;
		int firstRow = -1;
		int secondRow = -1;
		int[][] cardGrid1 = new int[4][4];
		int[][] cardGrid2 = new int[4][4];
		String output = "";
		
		Scanner s = null;
		BufferedWriter out = null;
		
		try {	
			s = new Scanner(new File(inputFile));
			out = new BufferedWriter(new FileWriter(outputFile));
			
			numTests = s.nextInt();
			for(int i=1; i<=numTests; i++) {
				
				firstRow = s.nextInt();
				for(int j=0; j<4; j++) {
					for(int k=0; k<4; k++) {
						cardGrid1[j][k] = s.nextInt();
					}
				}
				secondRow = s.nextInt();
				for(int j=0; j<4; j++) {
					for(int k=0; k<4; k++) {
						cardGrid2[j][k] = s.nextInt();
					}
				}
				
				output = MagicTrickOps.compareRows(cardGrid1[firstRow - 1], cardGrid2[secondRow - 1]);				
				out.write("Case #" + i + ": " + output + System.lineSeparator());
				
			}
			
		} catch (FileNotFoundException e1) {
			System.out.println(e1.getMessage());
		} catch(IOException e2) {
			System.out.println(e2.getMessage());
		} finally {
			if(s!=null) {
				s.close();
			}
			if(out!=null) {
				try {
					out.close();
				} catch(IOException e3) {
					System.out.println(e3.getMessage());
				}
			}
		}
		
		
	}
	
	
	
	

}
