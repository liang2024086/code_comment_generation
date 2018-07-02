package methodEmbedding.Standing_Ovation.S.LYD1845;

import java.io.*;

public class StandingOvation {

	public static void main(String[] args) {
		// Set up files
		File file = new File("A-small-attempt0.in");
		File outfile = new File("output.txt");
		if(!file.exists()) {
			System.err.println("File doesn't exist!");
			return;
		}
		// Set up data
		int T;
		int Smax;
		
		try {
			// Set up streams
			BufferedReader fin = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			BufferedWriter fout = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outfile)));
			
			String line = fin.readLine();
			T = Integer.parseInt(line.trim());
			
			for(int caseNum=0; caseNum<T; ++caseNum) {
				line = fin.readLine();
				String[] vals = line.split(" ");
				Smax = Integer.parseInt(vals[0]);
				int[] countShy = new int[Smax+1];
				for(int i=0; i<=Smax; ++i) {
					countShy[i] = Integer.parseInt("" + vals[1].charAt(i));
				}
				int countFriends = 0;
				int totalStandup = 0;
				for(int i=0; i<=Smax; ++i) {
					if(i > totalStandup) {
						int newFriends = i-totalStandup;
						countFriends += newFriends;
						totalStandup += newFriends + countShy[i];
					}
					else
						totalStandup += countShy[i];
				}
				
				System.out.println("Case #" + (caseNum+1) + ": " + countFriends);
				fout.write("Case #" + (caseNum+1) + ": " + countFriends + "\n");
			}
			
			// Clean up streams
			fin.close();
			fout.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}		

	}

}
