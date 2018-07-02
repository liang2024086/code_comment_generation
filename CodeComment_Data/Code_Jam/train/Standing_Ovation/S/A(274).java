package methodEmbedding.Standing_Ovation.S.LYD1211;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class A {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader(new File("A.in")));
		PrintWriter out = new PrintWriter(new FileWriter("A.out"));
		int tests = in.nextInt();
		System.out.println(tests);
		for (int k = 1; k <= tests; k++) {
			out.print("Case #" + (k) + ": ");
			System.out.print("Case #" + (k) + ": ");
			int n = in.nextInt();n++;
			String s = in.next();
			int[]comers = new int[n];
			for (int i = 0; i < n; i++) {
				comers[i] = s.charAt(i)-'0';
			}
			int []prev = new int[n];
			prev[0] = 0;
			for (int i = 1; i < n; i++) {
				prev[i] = prev[i-1] + comers[i-1];
			}
			int additional = 0;
			for (int i = 0; i < n; i++) {
				if(comers[i]> 0 && prev[i] + additional < i){
					additional += (i-(prev[i]+additional));
				}
			}
			out.println(additional);
			System.out.println(additional);
		}
		out.close();
	}

}
