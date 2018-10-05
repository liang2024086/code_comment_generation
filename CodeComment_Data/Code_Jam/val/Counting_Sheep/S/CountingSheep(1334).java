package methodEmbedding.Counting_Sheep.S.LYD59;


import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountingSheep {
	
	private static int casesCount;
	private static ArrayList<Integer> viewedNumbers = new ArrayList<Integer>();
	private static int currentN;
	private static String lastN = "";
	static File file = new File("J:\\code\\CodeJam2016\\input.txt");
	static PrintWriter writer;;

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(file);
		writer = new PrintWriter("output.txt", "UTF-8");
		casesCount = scan.nextInt();
		
		// While we still have cases to run
		for (int i = 1; i <= casesCount; i++) {
			// Clear variables out
			lastN = "";
			ArrayList<Integer> viewedNumbers = new ArrayList<Integer>();
			
			// Get currentN
			currentN = scan.nextInt();
			
			if (currentN == 0) lastN = "INSOMNIA";
			else {
				// While sheep is still awake
				for (int j = 1; viewedNumbers.size() < 10; j++) {
					for(int number : viewedNumbers) {
						//System.out.println("J = " + j + " number  = " + number);
					}
					lastN = Integer.toString(currentN * j);
					// Going through possible numbers to add to viewedNumbers
					for (int lastNnumber = 0; lastNnumber < lastN.length(); lastNnumber++) {
						//System.out.println("The character: " + Character.getNumericValue(lastN.charAt(lastNnumber)));
						//System.out.println(viewedNumbers.contains(Character.getNumericValue(lastN.charAt(lastNnumber))));
						if (!viewedNumbers.contains(Character.getNumericValue(lastN.charAt(lastNnumber)))) {
							//System.out.println(Arrays.asList(viewedNumbers));
							viewedNumbers.add(Character.getNumericValue(lastN.charAt(lastNnumber)));
							//System.out.println("Number found: " + (int)lastN.charAt(lastNnumber));
						}
					}
				}
			}
			System.out.println("Case #" + i + ": " + lastN);
			
			writer.println("Case #" + i + ": " + lastN);
			
		}
		writer.close();
	}

}
