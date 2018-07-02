package methodEmbedding.Standing_Ovation.S.LYD1548;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.StringTokenizer;

public class StandingOvation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("codejam.in"));
		int cases = Integer.parseInt(in.readLine());
		
		PrintStream out = new PrintStream(new File("codejam.out"));
		
		for (int i = 0; i < cases; i++) {
			StringTokenizer t = new StringTokenizer(in.readLine());
			t.nextToken();
			String str = t.nextToken();
			int num = 0, sum = 0;
			
			for (int x = 0; x < str.length(); x++) {
				if (sum < x) {
					num += x-sum;
					sum = x;
				}
				sum += Integer.parseInt(str.charAt(x)+"");
			}
			System.out.println(str+" "+num);
			out.println("Case #"+(i+1)+": "+num);
			
		}
		
		in.close();
		out.close();

	}

}
