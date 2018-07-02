package methodEmbedding.Revenge_of_the_Pancakes.S.LYD177;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class RevengeofthePancakes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = 0;
		int flips = 0;
		int ptr = 0;
		int flipPtr = 0;

		String currentCase = null;
		String tmpCase = null;

		String currentOutput = null;

		String inputFilename = "B-small-attempt0.in";
		String outputFilename = "B-small-attempt0.out";
		String newline = System.getProperty("line.separator");
		
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
			
			tmpCase = currentCase;
			flips = 0;
			ptr = 0;
			flipPtr = 0;
			
			do {
				ptr = tmpCase.indexOf('-');
				if (ptr != -1) {
					if (tmpCase.charAt(0) == '+') {
						tmpCase = tmpCase.substring(0,ptr).replace('+','-') + tmpCase.substring(ptr, tmpCase.length());
					} else if (tmpCase.charAt(0) == '-') {
						flipPtr = tmpCase.indexOf('+');
						if (flipPtr == -1) {
							flipPtr = tmpCase.length();
							tmpCase = tmpCase.substring(0,flipPtr).replace('-','+');
						} else
							tmpCase = tmpCase.substring(0,flipPtr).replace('-','+') + tmpCase.substring(flipPtr, tmpCase.length());
					}
					flips++;
				}				
			}while(ptr != -1);
			
			try {
				out.write("Case #"+(i+1)+": "+ flips + newline);
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
