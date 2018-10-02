package methodEmbedding.Cookie_Clicker_Alpha.S.LYD840;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


class cookies {

	public static void main (String[] args) throws IOException {
		
		int testCaseNum;
		
		double farmCost;
		double extraSpeed;
		double cookiesToWin;
		double bestTime = 0;
		
		String line = "";
		BufferedReader br = null;
		
		br = new BufferedReader(new FileReader("B-small-attempt0.in"));
		line = br.readLine();
		
		testCaseNum = Integer.parseInt(line);
		
		PrintWriter writer = new PrintWriter("B-small-attempt0.out", "UTF-8");
		
		for (int i = 0; i < testCaseNum; i++) {
			
			double speed = 2.0;
			// read and parse input
			line = br.readLine();
			int count = 0;
			String[] inputStorage = new String[3]; 
			
			for (int j = 0; j < line.length(); j++) {
				if (line.charAt(j) != ' ') {
					if (inputStorage[count] == null)
						inputStorage[count] = "";
					inputStorage[count] += line.charAt(j);
				} else {
					count++;
				}	
			}
			
			farmCost = Double.parseDouble(inputStorage[0]);
			extraSpeed = Double.parseDouble(inputStorage[1]);
			cookiesToWin = Double.parseDouble(inputStorage[2]);
			
			if (cookiesToWin <= farmCost) {
				bestTime = cookiesToWin/speed;
			} else {
				
				double timeWeSpent = 0;
				while ((farmCost/speed + cookiesToWin/(speed + extraSpeed)) < cookiesToWin/speed) {
					timeWeSpent += farmCost/speed;
					speed += extraSpeed;
				}	
				timeWeSpent += cookiesToWin/speed;
				bestTime = timeWeSpent;
			}
			int caseNumToPrint = i + 1;
			writer.println ("Case #" + caseNumToPrint + ": " + bestTime);
		}		
		writer.close();
	}
}
