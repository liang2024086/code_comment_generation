package methodEmbedding.Magic_Trick.S.LYD1259;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MagicTrick {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numInput = scanner.nextInt();
		for(int i=1; i<=numInput; i++) {
			int firstGuess = scanner.nextInt();
			Set<String> set1 = new HashSet<>();
			scanner.nextLine();
			for(int j=1; j<=4; j++) {
				String row = scanner.nextLine();
				if(j == firstGuess) {
					set1.addAll(Arrays.asList(row.split(" ")));
				}
			}
			int secondGuess = scanner.nextInt();
			Set<String> set2 = new HashSet<>();
			scanner.nextLine();
			for(int j=1; j<=4; j++) {
				String row = scanner.nextLine();
				if(j == secondGuess) {
					set2.addAll(Arrays.asList(row.split(" ")));
				}
			}
			
			set1.retainAll(set2);
			String answer = null;
			int size = set1.size();
			if(size == 1) {
				answer = set1.iterator().next();
			} else if (size == 0) {
				answer = "Volunteer cheated!";
			} else {
				answer = "Bad Magician!";
			}
			
			System.out.println((String.format("Case #%d: %s", i,answer)));
		}
	}

}
