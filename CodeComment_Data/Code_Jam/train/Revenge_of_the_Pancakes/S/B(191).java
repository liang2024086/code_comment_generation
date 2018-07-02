package methodEmbedding.Revenge_of_the_Pancakes.S.LYD702;


import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			int t = sc.nextInt();
			for (int i = 0; i< t; i++) {
				String pancakes = sc.next();
				int flipCount = 0;
				while (true) {
					int cntToRemove = 0;
					for (int j = pancakes.length() -1; j >= 0; j--) {
						if (pancakes.charAt(j) == '+') cntToRemove++;
						else break;
					}
					pancakes = pancakes.substring(0, pancakes.length() - cntToRemove);
					if (pancakes.isEmpty()) break;
					String flipped = pancakes;
					flipped = flipped.replaceAll("-", "!");
					flipped = flipped.replaceAll("\\+", "-");
					flipped = flipped.replaceAll("!", "+");
					pancakes = flipped;
					flipCount++;
				}
				System.out.println("Case #" + (i+1) + ": " + flipCount);
			}
		} catch(final Exception e) {
			e.printStackTrace();
			System.err.println("error!");
		}
	}
}
