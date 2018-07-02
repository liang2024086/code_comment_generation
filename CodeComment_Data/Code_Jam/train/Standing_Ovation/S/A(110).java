package methodEmbedding.Standing_Ovation.S.LYD1401;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter("A-small-attempt0.out"));
		InputStream is = new FileInputStream(new File("A-small-attempt0.in"));
//		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		int T = sc.nextInt();
		for (int t=1; t<=T; t++) {
			int Smax = sc.nextInt();
			byte[] levels = sc.next().getBytes();
			for (int i=0; i<levels.length; i++) {
				levels[i]-='0';
			}
//			System.out.println(Arrays.toString(levels));
			int stoodup = levels[0];
			int added = 0;
			for (int j=1; j<levels.length; j++) {
				if (stoodup+added<j) {
					added+=j-(stoodup+added);
				} 
				stoodup+=levels[j];
			}
			out.println("Case #"+t+": "+added);
			
		}
		out.close();
	}

}
