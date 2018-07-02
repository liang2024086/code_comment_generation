package methodEmbedding.Magic_Trick.S.LYD1865;

import java.util.HashSet;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nTestCases = Integer.parseInt(s.nextLine());
		
		for (int i = 0; i < nTestCases; i ++) {
			StringBuffer sb = new StringBuffer("Case #").append(i + 1).append(": ");
			HashSet<String> set = new HashSet<String>();
			int answer = Integer.parseInt(s.nextLine());
			
			for (int j = 1; j <= 4; j++) {
				if (answer == j) {
					for (String card : s.nextLine().split(" ")) {
						set.add(card);
					}
				} else {
					s.nextLine();
				}
			}
			
			answer = Integer.parseInt(s.nextLine());
			String result = "Volunteer cheated!";
			
			for (int j = 1; j <= 4; j++) {
				if (answer == j) {
					for (String card : s.nextLine().split(" ")) {
						if (set.contains(card)) {
							if (result.equals("Volunteer cheated!")) {
								result = card;
							} else {
								result = "Bad magician!";
							}
						}
					}
				} else {
					s.nextLine();
				}
			}
			
			sb.append(result);
			System.out.println(sb.toString());
		}
	}
}
