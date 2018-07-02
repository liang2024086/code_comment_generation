package methodEmbedding.Revenge_of_the_Pancakes.S.LYD797;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.BitSet;
import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream(new File("B-small-attempt0.in")));
		int t = Integer.parseInt(sc.nextLine());
		int tindex = 0;
		while (t-- > 0) {
			tindex++;
			String s = sc.nextLine();
			BitSet set = new BitSet();
			// + => 1 , - => 0
			int index = 0;
			for (char c : s.toCharArray()) {
				set.set(index++, c == '+');
			}
			int count = 0;
			while (index-- > 0) {
				if (!set.get(index)) {
					set.flip(0, index);
					count++;
				}
			}
			System.out.println("Case #" + tindex + ": " + count);
		}
	}

}
