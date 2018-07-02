package methodEmbedding.Speaking_in_Tongues.S.LYD592;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class Googlerese {

	/**
	 * By using the same cases I was able to create the map between "English" and "Googlerese"
	 * English    - a b c d e f g h i j k l m n o p q r s t u v w x y z
	 * Googlerese - y n f i c w l b k u o m x s e v z p d r j g t h a q 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = 0;
		int len = 0;
		int currentPointer = 0;
		String googlereseSeq = "ynficwlbkuomxsevzpdrjgthaq";
		String englishSeq = "abcdefghijklmnopqrstuvwxyz";
		String currentCase = null;
		char currentChar = ' ';
		String currentOutput = null;
		String inputFilename = "A-small-attempt0.in";
		String outputFilename = "A-small-attempt0.out";
		
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter(outputFilename));
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		FileInputStream fStream = null;
		try {
			fStream = new FileInputStream(inputFilename);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		DataInputStream in = new DataInputStream(fStream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		
		try {
			T = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for(int i=0;i<T;i++) {
			try {
				currentCase = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			len = currentCase.length();
			currentOutput = "";
			for(int j=0;j<len;j++) {
				currentChar = currentCase.charAt(j);
				if(currentChar == ' ') {
					currentOutput += ' ';
				} 
				else {
					currentPointer = googlereseSeq.indexOf(currentChar);
					currentOutput += englishSeq.charAt(currentPointer);
					
				}
			}
			
			try {
				out.write("Case #"+(i+1)+": "+currentOutput+'\n');
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}

}
