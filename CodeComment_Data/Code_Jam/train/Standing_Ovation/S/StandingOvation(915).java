package methodEmbedding.Standing_Ovation.S.LYD135;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StandingOvation {

//	static String inputFileName = "Inputs/sample.in.txt";
	static String inputFileName = "Inputs/A-small-attempt0.in.txt";
//	static String inputFileName = "Inputs/A-large.in.txt";
	static String outputFileName = "output.txt";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = null;		
		int T = 0;
		
		// read the input from a file
		try {
			br = new BufferedReader(new FileReader(inputFileName));
			
			String line = br.readLine();
			T = Integer.parseInt(line);	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		File file = new File(outputFileName);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileWriter fw = null;
		try {
			fw = new FileWriter(file.getAbsoluteFile());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedWriter bw = new BufferedWriter(fw);
		
		// Solve the problem
		for (int t = 1; t <= T; t++) {
			
			int sMax = 0;
			String shynessCountForEachLevel = null;
			
			int peopleStanding = 0;
			int peopleInvited = 0;
			int peopleInvitingForCurrentIndex = 0;
			
			try {
				String line = br.readLine();
				
				String[] splits = line.split(" ");;
				sMax = Integer.parseInt(splits[0]);
				shynessCountForEachLevel = splits[1];
				
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			for (int shynessIndex = 0; shynessIndex <= sMax; shynessIndex++) {
				peopleInvitingForCurrentIndex = 0;
				if (peopleStanding < shynessIndex)
				{
					peopleInvitingForCurrentIndex = shynessIndex - peopleStanding;
					peopleInvited += peopleInvitingForCurrentIndex;
				}				
				
				peopleStanding += Integer.parseInt(shynessCountForEachLevel.substring(shynessIndex, shynessIndex + 1))
						+ peopleInvitingForCurrentIndex;
			}			
			
			try {
				System.out.println(String.format("Case #%d: %d", t, peopleInvited));
				bw.write(String.format("Case #%d: %d\n", t, peopleInvited));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("done");
	}

}
