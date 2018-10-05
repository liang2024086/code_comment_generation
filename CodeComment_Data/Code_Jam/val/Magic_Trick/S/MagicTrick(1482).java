package methodEmbedding.Magic_Trick.S.LYD267;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if (args.length!=2) {
			System.out.println("MagicTrick <in> <out>");
			return;
		}
		
		
		try {
			
			BufferedReader in = new BufferedReader(new FileReader(args[0]));
			PrintWriter out = new PrintWriter(new FileWriter(args[1]));
			
			int testCases = Integer.parseInt(in.readLine());
			
			cases:
			for (int i=0; i<testCases; i++) {
				
				int[] numbers1 = new int[4];
				int[] numbers2 = new int[4];
				
				int rowno;
				
				rowno = Integer.parseInt(in.readLine());
				
				for (int j=0; j<4; j++) {
					if (j==rowno-1) {
						String[] stringnumbers = in.readLine().split(" ");
						for (int k=0; k<4; k++) {
							numbers1[k] = Integer.parseInt(stringnumbers[k]);
						}
					} else {
						in.readLine();
					}
				}
				
				rowno = Integer.parseInt(in.readLine());
				
				for (int j=0; j<4; j++) {
					if (j==rowno-1) {
						String[] stringnumbers = in.readLine().split(" ");
						for (int k=0; k<4; k++) {
							numbers2[k] = Integer.parseInt(stringnumbers[k]);
						}
					} else {
						in.readLine();
					}
				}
				
				int number = 0;
				
				for (int j=0; j<4; j++) {
					for (int k=0; k<4; k++) {
						if (numbers1[j]==numbers2[k]) {
							if (number==0) {
								number = numbers1[j];
							} else {
								out.println(String.format("Case #%1$d: Bad magician!", i+1));
								continue cases;
							}
						}
					}
				}
				
				if (number>0) {
					out.println(String.format("Case #%1$d: %2$d", i+1, number));
				} else {
					out.println(String.format("Case #%1$d: Volunteer cheated!", i+1));
				}
			}
			
			in.close();
			out.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(args[0] + " not found");
			return;
		} catch (IOException e) {
			System.out.println("Invalid input file");
			return;
		} catch (NumberFormatException e) {
			System.out.println("Invalid input file");
			return;
		}
		
	}

}
