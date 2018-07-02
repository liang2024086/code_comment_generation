package methodEmbedding.Standing_Ovation.S.LYD1673;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BufferedWriter outFile = new BufferedWriter (new FileWriter("out.out")) ;
			BufferedReader inFile = new BufferedReader(new FileReader("A-small-attempt1.in"));

			int testCase = 0;
			testCase = Integer.parseInt(inFile.readLine()) ;
			
			for (int i = 0 ; i < testCase ; i++) {

				String str = inFile.readLine(), shies = str.substring(2) ;
				int answer = 0, peoples = shies.charAt(0)  - '0' ;
				
				for (int j = 1 ; j < shies.length() ; j++ ) {
					
					while (peoples < j) {
						answer++ ;
						peoples++ ;
					}
					peoples += (shies.charAt(j) - '0') ;
				}
				
				outFile.write("Case #" + (i +1) + ": " + answer + "\r\n");
				
			}
			outFile.close();
			inFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
