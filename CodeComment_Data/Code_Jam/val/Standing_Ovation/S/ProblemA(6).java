package methodEmbedding.Standing_Ovation.S.LYD122;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ProblemA {

	private static Scanner scan;
	
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Expected 1 filename as argument");
		} else {
			try {
				scan = new Scanner(new BufferedReader(new FileReader(args[0])));
				int numCases = scan.nextInt();
				for (int tc = 0; tc < numCases; tc++) {
					int sMax = scan.nextInt();
					sMax++;
					String shynessStr = scan.nextLine();
					shynessStr = shynessStr.substring(1, shynessStr.length());
					int standing = 0;
					int friends = 0;
					for (int i = 0; i < sMax; i++) {
						if (standing < i) {
							friends += (i - standing);
							standing += (i - standing);
						}
						standing += Integer.parseInt(""+shynessStr.charAt(i));
					}
					System.out.println("Case #"+(tc+1)+": "+friends);
				}
			} catch (FileNotFoundException e) {
				System.out.println("Invalid filename");
			} finally {
				if (scan != null) {
					scan.close();
				}
			}
		}
	}

}
