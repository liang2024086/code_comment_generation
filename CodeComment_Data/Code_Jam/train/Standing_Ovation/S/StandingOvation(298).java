package methodEmbedding.Standing_Ovation.S.LYD904;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class StandingOvation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = 0;

		String currentCase = null;

		String inputFilename = "A-small-attempt0.in";
		String outputFilename = "A-small-attempt0.out";
		String newline = System.getProperty("line.separator");
		
		int minFriends = 0;
		int sMax = 0;
		int[] currentAudience;
		int willStand = 0;
		
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
			
			sMax = Integer.parseInt(currentCase.substring(0,currentCase.indexOf(' ')));
			currentAudience = new int[sMax+1];
			minFriends = 0;
			willStand = 0;
			
			for(int j=0;j<sMax+1;j++) {
				currentAudience[j] = Integer.parseInt(""+currentCase.charAt(currentCase.indexOf(' ')+j+1));
				
				if(j==0) {
					willStand += currentAudience[j];					
				} else {
					if ((willStand < j) && (currentAudience[j] != 0)) {
						minFriends += (j-willStand);
						willStand += currentAudience[j] + (j-willStand);	
					} else {
						willStand += currentAudience[j];					
					}
				}
			}
			
						
			try {
				out.write("Case #"+(i+1)+": "+minFriends+ newline);
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
