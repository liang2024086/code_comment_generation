package methodEmbedding.Magic_Trick.S.LYD2040;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class A {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		PrintStream outfile = new PrintStream("A-small.out.txt");
		int a, n;
		HashSet<Integer> set1 = new HashSet<Integer>();
		ArrayList<Integer> set2 = new ArrayList<Integer>();
		String result;
		for (int c = 1; c <= cases; c++) {
			set1.clear();
			set2.clear();
			a = scan.nextInt();
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4; j++) {
					n = scan.nextInt();
					if (i == a)
						set1.add(n);
				}
			}
			a = scan.nextInt();
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4; j++) {
					n = scan.nextInt();
					if (i == a && set1.contains(n))
						set2.add(n);
				}
			}
			if (set2.isEmpty())
				result = "Volunteer cheated!";
			else if (set2.size() >= 2)
				result = "Bad magician!";
			else
				result = set2.get(0).toString();
			outfile.println("Case #" + c + ": " + result);
			System.out.println("Case #" + c + ": " + result);
		}
		outfile.close();
	}
}
