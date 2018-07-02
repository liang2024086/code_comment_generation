package methodEmbedding.Magic_Trick.S.LYD41;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;


public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			FileInputStream fstream = new FileInputStream("input.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			
			PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
			
			Integer nbCases;
			String line = br.readLine();
			
			if (line != null) {
				nbCases = Integer.parseInt(line);
							
				for (int i = 1; i <= nbCases; i++) {
					
					Integer firstRowIndex = Integer.parseInt(br.readLine());
					
					String[] firstRowChosen = new String[4];
							
					for (int j = 1; j <= 4; j++) {
						
						line = br.readLine();
						
						if (j == firstRowIndex) {
							firstRowChosen = line.split("\\s+");
						}												
					}
					
					Integer secondRowIndex = Integer.parseInt(br.readLine());
					
					String[] secondRowChosen = new String[4];
							
					for (int j = 1; j <= 4; j++) {
						
						line = br.readLine();
						
						if (j == secondRowIndex) {
							secondRowChosen = line.split("\\s+");
						}												
					}
					
					ArrayList<String> result = new ArrayList<String>();
					for (int j=0; j<4; j++) {
						if ( Arrays.asList(secondRowChosen).indexOf(firstRowChosen[j]) != -1) {
							result.add(firstRowChosen[j]);
						}
					}
					
					writer.print("Case #" + Integer.toString(i) + ": ");
					if (result.size() == 0) {
						writer.println("Volunteer cheated!");
					} else if (result.size() > 1) {
						writer.println("Bad magician!");
					} else {
						writer.println(result.get(0));
					}
				}
			}
			writer.close();
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
