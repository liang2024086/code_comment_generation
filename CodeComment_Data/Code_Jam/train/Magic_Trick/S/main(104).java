package methodEmbedding.Magic_Trick.S.LYD1794;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	private static int cases;
	
	public static void main(String[] args) {
		ArrayList<String> output = new ArrayList<String>();
		ArrayList<String> input = new ArrayList<String>();
		try {
			Scanner sc = new Scanner(new File("files/A-small-attempt0.in"));
			
			while (sc.hasNext()) {
				input.add(sc.nextLine());
			}
			sc.close();
			
			// Get nubmer of cases.
			cases = Integer.parseInt(input.get(0));
			int caseNumber = 1;
			for (int i = 1; i <= 10*cases; i = i + 10) {
				System.out.println(i + "");
				String[] arr1 = new String[4];
				String[] arr2 = new String[4];
				
				// First case
				int guess1 = Integer.parseInt(input.get(i));
				String[] row1 = input.get(i + guess1).split(" ");
				int guess2 = Integer.parseInt(input.get(i + 5));
				String[] row2 = input.get(i + 5 + guess2).split(" ");
				
				String common = "";
				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < 4; k++) {
						if (row1[k].equals(row2[j])) {
							if (common.equals("")) {
								common = row1[k];
							} else {
								common = "Bad magician!";
							}
						}
					}
				}
				if (common.equals("")) {
					common = "Volunteer cheated!";
				}
				
				output.add("Case #" + caseNumber + ": " + common);
				caseNumber++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			PrintWriter writer = new PrintWriter("files/output.txt");
			for (String s : output) {
				writer.println(s);
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

