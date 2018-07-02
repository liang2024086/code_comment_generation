package methodEmbedding.Magic_Trick.S.LYD1406;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class A {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String filename = "A-small-attempt0.in";
		Scanner s = new Scanner(new FileReader(filename));
		PrintWriter out = new PrintWriter("outA.txt");
		int num = s.nextInt();
		for (int CASE = 1; CASE <= num; CASE++) {
			int raw1 = s.nextInt() - 1;
			Integer[][] grid1 = new Integer[4][4];
			for (int i = 0; i < grid1.length; i++) {
				for (int j = 0; j < grid1[i].length; j++) {
					grid1[i][j] = s.nextInt();
				}
			}
			int raw2 = s.nextInt() - 1;
			Integer[][] grid2 = new Integer[4][4];
			for (int i = 0; i < grid2.length; i++) {
				for (int j = 0; j < grid2[i].length; j++) {
					grid2[i][j] = s.nextInt();
				}
			}

			Set<Integer> a = new HashSet<Integer>(Arrays.asList(grid1[raw1]));
			Set<Integer> b = new HashSet<Integer>(Arrays.asList(grid2[raw2]));
			a.retainAll(b);
			Integer[] result = a.toArray(new Integer[a.size()]);
			if (result.length == 0)
				out.println("Case #" + CASE + ": Volunteer cheated!");
			else if (result.length == 1)
				out.println("Case #" + CASE + ": " + result[0]);
			else if (result.length >= 2)
				out.println("Case #" + CASE + ": Bad magician!");
		}
		out.close();
	}
}
