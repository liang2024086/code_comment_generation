package methodEmbedding.Standing_Ovation.S.LYD482;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintStream;



public class StandingOvation {
	
	public static void main(String[] args) throws Exception {
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader in = new BufferedReader(new FileReader("src/A-small-attempt0.in"));
		System.setOut(new PrintStream("standing.out"));
		
		for (int T = Integer.parseInt(in.readLine().trim()), t=1; t<=T; t++) {
			String [] a = in.readLine().split(" +");
			char[] b = a[1].toCharArray();
			int n = b.length;
			int c = 0; // cu?ntos se han levantado.
			int r = 0;
			for (int i=0; i<n; i++) if(b[i]!='0') {
				if (c < i) {
					r += i-c;
					c = i;
				}
				c += (b[i]-'0');
			}
			System.out.printf("Case #%d: %d%n", t, r);
		}
	}

}
