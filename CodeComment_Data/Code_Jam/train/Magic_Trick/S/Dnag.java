package methodEmbedding.Magic_Trick.S.LYD100;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dnag {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int caseNum;
		int fg;
		int[] fr = new int[4];
		int sg;
		int[] sr = new int[4];
		ArrayList<Integer> same = new ArrayList<Integer>();
		String output;
		PrintWriter writer;
		try {
			writer = new PrintWriter("output.txt", "UTF-8");
		

		try {
			Scanner scanner = new Scanner(new File("A-small-attempt1.in"));

			// while(scanner.hasNext()){
			caseNum = Integer.parseInt(scanner.nextLine());
			for (int k = 0; k < caseNum; k++) {
				same.clear();
				// first try
				fg = Integer.parseInt(scanner.nextLine());
				for (int i = 0; i < fg - 1; i++) {
					scanner.nextLine();
				}
				String[] a = scanner.nextLine().split(" ");
				for (int i = 0; i < a.length; i++) {
					fr[i] = Integer.parseInt(a[i]);
				}
				for (int i = 0; i < 4-fg; i++) {
					scanner.nextLine();
				}
				// second try
				sg = Integer.parseInt(scanner.nextLine());
				for (int i = 0; i < sg - 1; i++) {
					scanner.nextLine();
				}
				String[] b = scanner.nextLine().split(" ");
				for (int i = 0; i < 4-sg; i++) {
					scanner.nextLine();
				}
				for (int i = 0; i < b.length; i++) {
					sr[i] = Integer.parseInt(b[i]);
				}
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						if (fr[i] == sr[j]) {
							same.add(fr[i]);
						}
					}
				}
				switch (same.size()) {
				case 0:
					output = "Volunteer cheated!";
					break;
				case 1:
					output = "" + same.get(0);
					break;
				default:
					output = "Bad magician!";
					break;
				}
				
					writer.println("Case #" + (k+1) + ": " + output);
					//


			}
			writer.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		} catch (FileNotFoundException | UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
