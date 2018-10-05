package methodEmbedding.Magic_Trick.S.LYD726;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MagicTrick {

//	static String inputFileName = "Inputs/sample.in.txt";
	static String inputFileName = "Inputs/A-small-attempt0.in.txt";
	static String outputFileName = "output.txt";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = null;		
		int N = 0;
		
		// read the input from a file
		try {
			br = new BufferedReader(new FileReader(inputFileName));
			
			String line = br.readLine();
			N = Integer.parseInt(line);	
			
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
		int answer = 0;		
		String line = null;
		ArrayList<Integer> cards = new ArrayList<Integer>();
		int cardMatched = 0;
		int secondRowCard;
		int MatchValue = 0;
		
		for (int n = 1; n <= N; n++) {
			cards.clear();
			cardMatched = 0;
			
			try {
				line = br.readLine();
				answer = Integer.parseInt(line);											
				for (int r = 1; r <= 4; r++) {
					line = br.readLine();	
					if (answer == r) {
						String[] row = line.split(" ");
						for (String oneCard : row) {
							cards.add(Integer.parseInt(oneCard));
						}
					}
				}
				
				line = br.readLine();
				answer = Integer.parseInt(line);
				for (int r = 1; r <= 4; r++) {
					line = br.readLine();	
					if (answer == r) {
						String[] row = line.split(" ");
						for (String oneCard : row) {
							secondRowCard = Integer.parseInt(oneCard);
							
							if (cards.contains(secondRowCard)) {
								cardMatched++;
								MatchValue = secondRowCard;
							}
						}
					}
				}
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}						
			
			try {
				switch (cardMatched) {
					case 0:
						System.out.println("Case #" + n + ": Volunteer cheated!");
						bw.write("Case #" + n + ": Volunteer cheated!" + "\n");
						break;
					
					case 1:
						System.out.println("Case #" + n + ": " + MatchValue);
						bw.write("Case #" + n + ": " + MatchValue + "\n");
						break;
						
					default:
						System.out.println("Case #" + n + ": Bad magician!");
						bw.write("Case #" + n + ": Bad magician!" + "\n");
						break;
				}						
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
