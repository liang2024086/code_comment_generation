package methodEmbedding.Standing_Ovation.S.LYD7;

/**
 * 
 */

import java.io.*;

/**
 * @author Kisna
 *
 */
public class StandingOvation {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			
			FileWriter fstream = new FileWriter("outputA.out");
			BufferedWriter out = new BufferedWriter(fstream);
			String sCurrentLine;

			br = new BufferedReader(new FileReader("A-small-attempt0.in"));
			sCurrentLine = br.readLine();
			int i = 1;
			
			while ((sCurrentLine = br.readLine()) != null) {
				String[] Tokens = sCurrentLine.split(" ");
				int N = Integer.parseInt(Tokens[0]);
				int persons = Integer.parseInt(Tokens[1].charAt(0) + "");
				int added = 0;
				for(int j = 1; j <= N; j++){
					int count = Integer.parseInt(Tokens[1].charAt(j) + "");
					if(persons >= j || count == 0){
						persons += count;
						continue;
					} else {
						int toadd = j - persons;
						persons += toadd + count;
						added += toadd;
					}
				}
				System.out.println("Case #" + i + ": " + added);
				out.write("Case #" + i++ + ": " + added);
				out.write("\n");
			}
			
			out.close();

		} catch (IOException e) {
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
			}
		}
	}
}
