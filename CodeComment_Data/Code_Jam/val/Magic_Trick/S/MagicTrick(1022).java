package methodEmbedding.Magic_Trick.S.LYD2172;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class MagicTrick {

	private static final int LINE_NUM = 4;
	
	public static void main(String[] args) throws IOException {
		PrintWriter out;
		Scanner scanner;
		out = new PrintWriter(new FileWriter("out.txt"));
		scanner = new Scanner(new BufferedReader(new FileReader("in.txt")));
//		out = new PrintWriter(System.out);
//		scanner = new Scanner(System.in);
		
		int T = Integer.parseInt(scanner.nextLine());
		LinkedList<String> set = null;
		String s;
		for (int i = 1; i <= T; i++) {
			int line = Integer.parseInt(scanner.nextLine());
			for (int j = 1; j <= LINE_NUM; j++) {
				s = scanner.nextLine();
				if (j == line) {
					set = new LinkedList<String>(Arrays.asList(s.split("\\s+")));
				}
			}
			line = Integer.parseInt(scanner.nextLine());
			for (int j = 1; j <= LINE_NUM; j++) {
				s = scanner.nextLine();
				if (j == line) {
					set.retainAll(Arrays.asList(s.split("\\s+")));
				}
			}
			out.print("Case #"+i+": ");
			if (set.size() == 1)
				out.println(set.get(0));
			else if (set.size() > 1)
				out.println("Bad magician!");
			else
				out.println("Volunteer cheated!");
		}
		
		out.close();
		scanner.close();
	}

}
