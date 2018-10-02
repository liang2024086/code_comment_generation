package methodEmbedding.Magic_Trick.S.LYD1801;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MagicTrick {

	List<Set<Integer>> square;

	public static void main(String args[]) throws IOException {
		FileReader fr = new FileReader("/Users/mattiaognibene/Downloads/A-small-attempt0.in");
		BufferedReader br = new BufferedReader(fr);
		Scanner in = new Scanner(br);

		FileOutputStream output = new FileOutputStream("/Users/mattiaognibene/Downloads/output.txt");
        PrintStream scrivi = new PrintStream(output);
		
		String vc = "Volunteer cheated!";
		String bm = "Bad magician!";
		int cases = in.nextInt();
		for (int i = 1; i <= cases; i++) {
			TreeSet<Integer> line1 = new TreeSet<Integer>();
			int question = in.nextInt();
			for (int k = 1; k <= 4; k++) {
				for (int j = 0; j < 4; j++) {
					int temp = in.nextInt();
					if (k == question)
						line1.add(temp);
				}
			}
			//System.out.println(line1);
			TreeSet<Integer> line2 = new TreeSet<Integer>();
			int question2 = in.nextInt();
			for (int k = 1; k <= 4; k++) {
				for (int j = 0; j < 4; j++) {
					int temp = in.nextInt();
					if (k == question2)
						line2.add(temp);
				}
			}
			//System.out.println(line2);
			line1.retainAll(line2);
			System.out.println(line1);
			if (line1.isEmpty()) {
				scrivi.println("Case #" + i + ": "+ vc);
			}
			else if (line1.size() == 1){
				scrivi.println("Case #" + i + ": " + line1.first());
			}
			else{
				scrivi.println("Case #" + i + ": "+ bm);
			}
		}

	}
}
