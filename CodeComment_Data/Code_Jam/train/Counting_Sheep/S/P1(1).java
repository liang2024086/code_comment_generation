package methodEmbedding.Counting_Sheep.S.LYD1276;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class P1 {

	private static int cases;
	private static int N;
	private static ArrayList<Character> numList;
	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("A-small-attempt0.in"));
		FileWriter outFile = new FileWriter("output.txt");
		cases = scan.nextInt();
		System.out.println(cases);
		for (int i = 0; i < cases; i++) {
			N = scan.nextInt();
			System.out.println(N);
			if (N == 0) {
				System.out.println("Case #" + (i+1) + ": INSOMNIA");
				outFile.append("Case #" + (i+1) + ": INSOMNIA\n");
			}
			else {
				numList = new ArrayList<Character>();
				String thisNum = "0";
				int time = 0;
				while (numList.size() != 10) {
					time++;
					thisNum = Integer.toString(time * N);
					for (int j = 0; j < thisNum.length(); j++) {
						if (!numList.contains(thisNum.charAt(j))) {
							numList.add(thisNum.charAt(j));
						}
					}
				}
				System.out.println("Case #" + (i+1) + ": " + thisNum);
				outFile.append("Case #" + (i+1) + ": " + thisNum + "\n");
			}
		}
		scan.close();
		outFile.close();
	}
}
