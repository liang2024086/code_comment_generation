package methodEmbedding.Standing_Ovation.S.LYD1500;


import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A {

	public static void main(String[] args) throws Exception {

		String input = "C:\\Users\\weekien\\Downloads\\A-small-attempt1.in";
		String output = "C:\\Users\\weekien\\Downloads\\A-small-attempt1.out";
		System.setIn(new FileInputStream(new File(input)));
		System.setOut(new PrintStream(new File(output)));
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();

		for (int m = 0; m < cases; m++) {
			int smax = in.nextInt();
			String s = in.next();
		     

			int temp = 0;
			int count = 0;
			int noppl = 0;
			int i;
			for (i = 0; i < smax + 1; i++) {
				int value = Integer.valueOf(s.charAt(i)-'0');

				if (value == 0) {
					count++;
				} else {
					if (temp < i && i>0) {
						noppl += i-temp;
						temp += count;
					}
					count = 0;
					temp += value;
				}
				
				

			}

			System.out.printf("Case #%d: %d", m + 1, noppl);
			System.out.printf("\n");	
	           
		}
		in.close();

	}
}
