package methodEmbedding.Standing_Ovation.S.LYD1350;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		InputStream in = null; // = System.in;
		try {
			in = new FileInputStream("in/A-small-attempt0.in.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PrintWriter out = null; // System.out;
		try {
			out = new PrintWriter(new FileWriter("out/A-small-attempt0.out.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner scanner = new Scanner(in);
		int T = scanner.nextInt();
		for (int i = 1; i <= T; i++) {
			int smax = scanner.nextInt();
			String s = scanner.next();
			
			int sum = 0;
			int add = 0;
			for (int j = 0; j <= smax; j++) {
				char c = s.charAt(j);
				int val = Integer.parseUnsignedInt(String.valueOf(c));
				if (sum < j) {
					add += j - sum;
					sum += j - sum;
				}
				
				sum += val;
				
			}
			out.println("Case #"+i+": "+add);
		}
		
		
//		4
//		4 11111
//		1 09
//		5 110011
//		0 1
		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.close();
	}

}
