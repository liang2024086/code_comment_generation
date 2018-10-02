package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1143;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("in.txt"));
		int numCases = Integer.parseInt(s.nextLine());
		long time = System.currentTimeMillis();
		for (int i = 0; i < numCases; i++) {
			String stack = s.nextLine();
			int result = new PancakeFlipper().flipAllHappySideUp(stack);
			System.out.print("Case #" + (i + 1) + ": " + result);
			System.out.println();
		}
		System.out.println("Time: " + (System.currentTimeMillis() - time));
		s.close();
	}

}
