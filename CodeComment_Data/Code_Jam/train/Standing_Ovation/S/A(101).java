package methodEmbedding.Standing_Ovation.S.LYD1204;

import java.util.Scanner;

public class A{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		String currentCase;
		int people = 0;
		int stand = 0;
		int caseSize;
		for (int i = 0; i < cases; i++){
			people = 0;
			stand = 0;
			caseSize = scanner.nextInt();
			currentCase = scanner.nextLine();
			for (int k = 1; k <= caseSize + 1; k++){
				stand += Integer.parseInt(Character.toString(currentCase.charAt(k)));
				if (stand < k){
					people++;
					stand++;
				}
				//stand += people;
			}
			System.out.println("Case #" + (i + 1) + ": " + people);
		}
	}
}
