package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1008;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class B {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		PrintWriter pr = new PrintWriter(new FileOutputStream("B.txt"));
		// PrintStream pr = System.out;
		char[] stack;
		int sol;
		for(int i = 1; i <= t; i++) {
			sol = 0;
			stack = s.next().toCharArray();
			if(stack[stack.length - 1] == '-') {
				sol++;
			}
			for (int j = 0; j < stack.length - 1; j++) {
				if(stack[j] != stack[j + 1]) {
					sol++;
				}
			}
			pr.printf("Case #%d: %d\n", i, sol);
		}
		pr.close();
	}

}
